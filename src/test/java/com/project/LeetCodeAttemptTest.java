package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void findTheNumberOfDistinctColorsAmongTheBallsTest() {

        int[][] queries1 = new int[][]{{1,4},{2,5},{1,3},{3,4}};
        int[] result1 = new int[]{1,2,2,3};
        assertArrayEquals(result1, LeetCodeAttempt.findTheNumberOfDistinctColorsAmongTheBalls(4, queries1));

        int[][] queries2 = new int[][]{{0,1},{1,2},{2,2},{3,4},{4,5}};
        int[] result2 = new int[]{1,2,2,3,4};
        assertArrayEquals(result2, LeetCodeAttempt.findTheNumberOfDistinctColorsAmongTheBalls(4, queries2));

    }

}
