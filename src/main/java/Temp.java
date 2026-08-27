import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (9.0 / 5.0) * celsius + 32;

        System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit.%n", celsius, fahrenheit);
    }
}
