package org.example;

import java.util.HashMap;
import java.util.Map;

public class count {
        public static int countPairsWithSum(int[] arr, int X) {

        Map<Integer, Integer> numFrequency = new HashMap<>();
        int count = 0;

        // Iterate through the array
        for (int num : arr) {
            // Calculate the difference between the target sum X and the current number
            int difference = X - num;

            // Check if the difference is in the HashMap and the corresponding value is greater than 0
            if (numFrequency.containsKey(difference) && numFrequency.get(difference) > 0) {
                // Increment the count of pairs
                count++;
                numFrequency.put(difference, numFrequency.get(difference) - 1);
            } else {
                // Increment
                numFrequency.put(num, numFrequency.getOrDefault(num, 0) + 1);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 10, 32, 41};
        int X = 42;
        int result = countPairsWithSum(arr, X);
        System.out.println("Number of pairs with sum " + X + ": " + result);
    }
}
