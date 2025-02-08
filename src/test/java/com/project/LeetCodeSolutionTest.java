package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void queryResultsTest() {

        int[][] queries1 = new int[][]{{1,4},{2,5},{1,3},{3,4}};
        int[] result1 = new int[]{1,2,2,3};
        assertArrayEquals(result1, LeetCodeSolution.queryResults(4, queries1));

        int[][] queries2 = new int[][]{{0,1},{1,2},{2,2},{3,4},{4,5}};
        int[] result2 = new int[]{1,2,2,3,4};
        assertArrayEquals(result2, LeetCodeSolution.queryResults(4, queries2));

    }

}
