package ch.hatbe.juventus.javadoc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {
    MathUtil mathUtil;

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void numbers(int candidate) {
        assertTrue(candidate == 1 || candidate == 2 || candidate == 3 || candidate == 4 || candidate == 5);
    }

    @BeforeEach
    public void setUp() {
       this.mathUtil  = new MathUtil();
    }

    @Test
    @DisplayName("Test Additions")
    public void testAddition() {
        assertEquals(10.0, this.mathUtil.addition(Arrays.asList(5.0,5.0)), "failed addition");
        assertEquals(100.0, this.mathUtil.addition(Arrays.asList(4.0,95.0, 1.0)), "failed addition");
    }

    @Test
    @DisplayName("Test Subtractions")
    public void testSubtraction() {
        assertEquals(5, this.mathUtil.subtraction(6, 1), "failed subtraction");
        assertEquals(4, this.mathUtil.subtraction(7, 3), "failed subtraction");
    }

    @Test
    @DisplayName("Test Divisions")
    public void testDivision() {
        assertEquals(5, this.mathUtil.division(10, 2), "failed division");
        assertEquals(50, this.mathUtil.division(200, 4), "failed division");
    }

    @Test
    @DisplayName("Test Multiplications")
    public void testMultiplication() {
        assertEquals(20, this.mathUtil.multiplication(10, 2), "failed multiplication");
        assertEquals(30, this.mathUtil.multiplication(5, 6), "failed multiplication");
    }
}