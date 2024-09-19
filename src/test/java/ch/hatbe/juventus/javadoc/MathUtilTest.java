package ch.hatbe.juventus.javadoc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {
    MathUtil mathUtil;

    @BeforeEach
    public void setUp() {
       this.mathUtil  = new MathUtil();
    }

    @Test
    public void testAddition() {
        assertEquals(10.0, this.mathUtil.addition(Arrays.asList(5.0,5.0)), "failed addition");
    }

    @Test
    public void testSubtraction() {
        assertEquals(5, this.mathUtil.subtraction(6, 1), "failed subtraction");
    }

    @Test
    public void testDivision() {
        assertEquals(5, this.mathUtil.division(10, 2), "failed division");
    }

    @Test
    public void testMultiplication() {
        assertEquals(20, this.mathUtil.multiplication(10, 2), "failed multiplication");
    }
}