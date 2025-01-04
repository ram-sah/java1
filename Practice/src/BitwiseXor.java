import java.util.Scanner;

public class BitwiseXor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Bitwise XOR app ");
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = input.nextInt();
        int result = num1 ^ num2 ;
        System.out.print("Bitwise XOR Result is: " + result);
    }
}
