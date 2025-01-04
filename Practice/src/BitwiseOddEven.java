import java.util.Scanner;

public class BitwiseOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to  odd even number app");
        System.out.print("Enter num: ");
        int num = input.nextInt();
        if ((num & 1) == 1) {
            System.out.print(num + "Your number is Odd");
        } else {
            System.out.print( num + "Your number is Even ");
        }
    }
}
