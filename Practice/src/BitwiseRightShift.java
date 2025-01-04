import java.util.Scanner;

public class BitwiseRightShift {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Bitwise Right Shift app ");
        System.out.print("Enter first number: ");
        int num = input.nextInt();
        int result = num >> 1;
        System.out.print("Bitwise Right Shift is: " + result);
    }
}
