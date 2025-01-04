import java.util.Scanner;

public class BitwiseAnd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Bitwise app");
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = input.nextInt();
        int result = num1 & num2 ;
        System.out.print("Result is: " + result);
    }
}
