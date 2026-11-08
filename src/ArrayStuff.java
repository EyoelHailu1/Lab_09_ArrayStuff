import java.util.Random;
import java.util.Scanner;

public class ArrayStuff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        // Step 1: Create an array of 100 integers.
        int[] dataPoints = new int[100];

        // Step 2: Fill the array with random numbers from 1 to 100.
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Step 3: Display the values.
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i] + " | ");
        }

        System.out.println();

        // Step 4: Calculate the sum and average.
        int sum = 0;

        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }

        double average = (double) sum / dataPoints.length;

        System.out.println("The sum of dataPoints is: " + sum);
        System.out.println("The average of dataPoints is: " + average);

        // Step 5: Get a number from the user.
        int searchValue = SafeInput.getRangedInt(
                in, "Enter a number to count", 1, 100);

        // Step 6: Count how many times the number appears.
        int count = 0;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == searchValue) {
                count++;
            }
        }

        System.out.println("The value " + searchValue
                + " was found " + count + " time(s) in dataPoints.");

        // Step 7: Find the first index of another number.
        int findValue = SafeInput.getRangedInt(
                in, "Enter a number to find its first index", 1, 100);

        int foundIndex = -1;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == findValue) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("The value " + findValue
                    + " was found at array index " + foundIndex + ".");
        } else {
            System.out.println("The value " + findValue
                    + " was not found in dataPoints.");
        }

        // Step 8: Find the minimum and maximum values.
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }

            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }

        System.out.println("The minimum value in dataPoints is: " + min);
        System.out.println("The maximum value in dataPoints is: " + max);

        // Step 9: Copy the integers into a double array.
        double[] doubleValues = new double[dataPoints.length];

        for (int i = 0; i < dataPoints.length; i++) {
            doubleValues[i] = dataPoints[i];
        }

        // Call and test the getAverage method.
        System.out.println("Average of dataPoints using getAverage is: "
                + getAverage(doubleValues));
    }

    // Step 9: Return the average of a double array.
    public static double getAverage(double values[]) {
        double sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        return sum / values.length;
    }
}