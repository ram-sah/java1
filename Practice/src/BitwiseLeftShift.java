import java.util.Scanner;

public class BitwiseLeftShift {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Bitwise Left Shift app ");
        System.out.print("Enter first number: ");
        int num = input.nextInt();
        int result =  num << 1;
        System.out.print("Bitwise Left Shift is: " + result);
    }
}
