import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num 1: ");
        float num1 = input.nextFloat();
        System.out.println("Enter num 2: ");
        float num2 = input.nextFloat();
        float product = num1 * num2;
        System.out.println("Product:  " + product);
    }
}
