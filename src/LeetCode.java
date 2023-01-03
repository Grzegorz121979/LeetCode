import java.util.Scanner;

public class LeetCode {
        public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter C for Celsius or F for Fahrenheit: ");
        String degree = keyboard.next().toUpperCase();

        switch (degree) {
            case "C":
                System.out.print("Celsius: ");
                double result_cel = celsius_to_fahrenheit(keyboard.nextDouble());
                System.out.println("Fahrenheit: " + Math.round(result_cel));
                break;
            case "F":
                System.out.print("Fahrenheit: ");
                double result_fah = fahrenheit_to_celsius(keyboard.nextDouble());
                System.out.println("Celsius: " + Math.round(result_fah));
                break;
        }

    }

    static double celsius_to_fahrenheit(double celsius) {
        return 1.8 * celsius + 32;
    }

    static double fahrenheit_to_celsius(double fahrenheit) {
        return (fahrenheit - 32) * 0.5556;
    }
}

