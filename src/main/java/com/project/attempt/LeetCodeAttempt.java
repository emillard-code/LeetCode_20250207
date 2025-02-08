package com.project.attempt;

import java.util.Arrays;
import java.util.HashSet;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        int[][] queries1 = new int[][]{{1,4},{2,5},{1,3},{3,4}};
        System.out.println(Arrays.toString(findTheNumberOfDistinctColorsAmongTheBalls(4, queries1)));

        int[][] queries2 = new int[][]{{0,1},{1,2},{2,2},{3,4},{4,5}};
        System.out.println(Arrays.toString(findTheNumberOfDistinctColorsAmongTheBalls(4, queries2)));

    }

    // This method returns the number of distinct colors among the balls at the end of each query.
    public static int[] findTheNumberOfDistinctColorsAmongTheBalls(int limit, int[][] queries) {

        // We will store our result in int[] result.
        int[] result = new int[queries.length];

        // We will store the current colors of each circle in int[] circles.
        // -1 is the default value that represents a state of no colors.
        int[] circles = new int[limit+1];
        Arrays.fill(circles, -1);

        for (int i = 0; i < queries.length; i++) {

            // We perform each query one by one and fill in circles[] with the appropriate colors.
            circles[queries[i][0]] = queries[i][1];

            // After each query, we have a set that will contain every unique color.
            HashSet coloredCircles = new HashSet();

            // We iterate through circles[] and add each valid color to the hash set.
            // Since sets can only contain unique values, this avoids duplicate colors.
            for (int circle : circles) {
                if (circle != -1) { coloredCircles.add(circle); }
            }

            // In the end, the size of the hash set is added to the result[] array.
            result[i] = coloredCircles.size();

        }

        return result;

    }

}
