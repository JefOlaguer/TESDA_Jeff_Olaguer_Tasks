package chapter4;

public class Task8 {

    // Calculate the cumulative sum for each parameter
        public static int[] cumulativeSum(int... numbers) {
        int[] cumulativeSums = new int[numbers.length];
        int totalSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            int sumUpToCurrent = (currentNumber * (currentNumber + 1)) / 2;  // Sum from 1 to currentNumber
            cumulativeSums[i] = sumUpToCurrent;  // Store the cumulative sum

            totalSum += sumUpToCurrent;  // Add to the total sum
        }

        System.out.println("Total sum of all parameters: " + totalSum);
        return cumulativeSums;
    }

    public static void main(String[] args) {
        // Example input (4, 5, 10)
        int[] result = cumulativeSum(4, 5, 10);
        
        // Print the cumulative sums for each number
        for (int i = 0; i < result.length; i++) {
            System.out.println("Cumulative sum up of parameter" + (i+1) + ": " + result[i]);
        }
    }
}
