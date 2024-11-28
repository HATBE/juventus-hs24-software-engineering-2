package ch.hatbe.juventus.mocking;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    UserRepository userRepository;

    @Spy
    @InjectMocks
    UserService userService;

    @Test
    public void testActiveUsersWithEmptyInput() {
        // given
        when(userRepository.getUsers()).thenReturn(new ArrayList<>());

        // when
        List<User> activeUsers = userService.getActiveUsers();

        // then
        assertThat(activeUsers.size()).isEqualTo(0);
        verify(userRepository, times(1)).getUsers();

    }

    @Test
    public void testException() {

        when(userRepository.getUsers()).thenThrow(new UnsupportedOperationException("Users not available"));

        UnsupportedOperationException exception = assertThrows(UnsupportedOperationException.class, () -> {
            userService.getActiveUsers();
        });

        assertEquals("Users not available", exception.getMessage());
    }

    @Test
    public void testFindActiveUserByName() {
        when(userRepository.getUsers()).thenReturn(List.of(new User("linda", 30)));
        doReturn(true).when(userService).isActive(any());

        User user = userService.findActiveUser("linda");

        assertThat(user.getName()).isEqualTo("linda");
        verify(userService, times(1)).isActive(assertArg(userArg -> {
            assertThat(userArg.getName()).isEqualTo("linda");
        }));
    }

    @Test
    public void testFindActiveUserByNameWithMultipleUsers() {
        User linda = new User("linda", 30);
        User michael = new User("michael", 30);
        when(userRepository.getUsers()).thenReturn(List.of(linda, michael));
        doReturn(false).when(userService).isActive(linda);
        doReturn(true).when(userService).isActive(michael);

        User user = userService.findActiveUser("linda");
        User user2 = userService.findActiveUser("michael");

        assertThat(user).isNull();
        assertThat(user2).isEqualTo(michael);
    }

    @Test
    public void testGetAdultUsers() {
        User linda = new User("linda", 30);
        User aris = new User("aris", 12);
        List<User> userList = List.of(linda, aris);
        when(userRepository.getUsers()).thenReturn(userList);
        ArgumentCaptor<User> userCaptor = ArgumentCaptor.forClass(User.class);
        ArgumentCaptor<Integer> ageCaptor = ArgumentCaptor.forClass(Integer.class);

        List<User> adultUsers = userService.getAdultUsers();

        verify(userService, times(2)).isOlderThan(userCaptor.capture(), ageCaptor.capture());
        assertEquals(userList, userCaptor.getAllValues());
        assertEquals(List.of(18, 18), ageCaptor.getAllValues());
        assertEquals(List.of(linda), adultUsers);
    }

    @Test
    public void testBDDAliases() {
        given(userRepository.getUsers()).willReturn(new ArrayList<>());

        List<User> activeUsers = userService.getActiveUsers();

        assertThat(activeUsers.size()).isEqualTo(0);
        then(userRepository).should(times(1)).getUsers();
    }

}