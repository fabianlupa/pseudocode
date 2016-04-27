package com.flaiker.checksum;

public class ChecksumChecker {
    public static boolean checkId(String numbers) {
        // Input validation
        if (numbers == null) throw new IllegalArgumentException("Input cannot be null.");
        if (numbers.length() < 2) throw new IllegalArgumentException("There must be at least two numbers.");

        // Parse input
        final int[] numArr = numbers.substring(0, numbers.length() - 1).chars().map(Character::getNumericValue).toArray();
        final int checkSum = Character.getNumericValue(numbers.charAt(numbers.length() - 1));

        // Step 1
        for (int i = 1; i < numArr.length; i += 2) numArr[i] = numArr[i] * 2;

        // Step 2
        int sum = 0;
        for (int i = 1; i < numArr.length; i += 2)
            sum += String.valueOf(numArr[i]).chars().map(Character::getNumericValue).sum();

        // Step 3
        int sum2 = 0;
        for (int i = 0; i < numArr.length; i += 2) sum2 += numArr[i];

        // Step 4
        int sum3 = sum + sum2;

        // Step 5
        int adjusted;
        adjusted = sum3 % 10 != 0 ? sum3 + sum3 % 10 : sum3;

        // Step 6
        int diff = adjusted - sum3;

        return checkSum == diff;
    }
}
