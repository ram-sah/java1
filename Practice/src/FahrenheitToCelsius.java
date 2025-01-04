import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter fahrenheit: ");
        float f = input.nextFloat();
        float celsius = (f-32)*5/9;
        System.out.println("Celsius : " +celsius );
    }
}
