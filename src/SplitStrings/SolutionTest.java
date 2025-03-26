package src.SplitStrings;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {
    @Test
    public void testEvenString() {
        String s = "abcdef";
        String s1 = "HelloWorld";
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringSplit.solution(s), "Should handle even string");
        assertArrayEquals(new String[]{"He", "ll", "oW", "or", "ld"}, StringSplit.solution(s1), "Should handle even string");
    }

    @Test
    public void testOddString() {
        String s = "abcde";
        String s1 = "LovePizza";
        assertArrayEquals(new String[]{"ab", "cd", "e_"}, StringSplit.solution(s), "Should handle odd string");
        assertArrayEquals(new String[]{"Lo", "ve", "Pi", "zz", "a_"}, StringSplit.solution(s1), "Should handle odd string");
    }
}

