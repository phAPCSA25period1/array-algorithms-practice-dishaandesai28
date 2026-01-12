package com.csplusplus;

public class Unit6 {

    // 1. Implement a method that takes an array of integers and returns the sum of all elements.
    // Instructions: Use a for-each loop to iterate through the array and calculate the sum.
    public static int sumArray(int[] array) {
        // TODO: Implement this method
        int sum = 0;
        for (int val : array) {
            sum += val;
        }
        return sum;  // Placeholder return value, replace with the correct sum.
    }

    // 2. Implement a method that finds the maximum element in an array of integers.
    // Instructions: Iterate through the array and track the largest number found.
    public static int maxElement(int[] array) {
        // TODO: Implement this method
        int max = Integer.MIN_VALUE;
        for (int val : array){
            if (val > max) {
                max = val;
            }
        }
        return max;  // Placeholder return value, replace with the correct maximum element.
    }

    // 3. Implement a method that takes an array and returns a new array with the elements in reverse order.
    // Instructions: Create a new array of the same size, and fill it with elements from the original array in reverse order.
    public static int[] reverseArray(int[] array) {
        // TODO: Implement this method
        int reversedOrder;
        for (int i = array.length - 1; i >= 0; i--) {
            reversedOrder+= i;
        }
        return reversedOrder;  // Placeholder return value, replace with the reversed array.
    }

    // 4. Implement a method that checks whether the given array is sorted in ascending order.
    // Instructions: Iterate through the array and check if each element is greater than or equal to the previous element.
    public static boolean isSorted(int[] array) {
        // TODO: Implement this method
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;  // Placeholder return value, replace with the correct boolean.
    }

    // 5. Implement a method that counts how many times a given number appears in the array.
    // Instructions: Use a for-each loop to iterate through the array and count the occurrences of the given number.
    public static int countOccurrences(int[] array, int number) {
        int count = 0;
        for (int value : array) {
            if (value = number) {
                count ++;
            }
        }
        // TODO: Implement this method
        return count;  // Placeholder return value, replace with the correct count.
    }
}
