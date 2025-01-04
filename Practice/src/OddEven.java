import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Determine number is Odd or Even: \n");
        System.out.print("Enter number : ");
        try {
            int num = input.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " is Even number");
            } else {
                System.out.println(num + " is Odd");
            }
        } catch (Exception e) {
            System.out.println("Enter valid number: ");
        } finally {
            input.close();

        }
    }
}
