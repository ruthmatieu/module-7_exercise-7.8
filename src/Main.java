import java.util.Scanner;

public class Main {
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] values = new double[10];

        System.out.println("Enter ten double values: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextDouble();
        }

        double avg = average(values);
        System.out.println("The average of the values: " + avg);

        input.close();
    }
}