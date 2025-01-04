import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = input.nextInt();
        int swap = num2;
        num2 = num1;
        num1 = swap;
        System.out.print("Your first number: " + swap + " and 2nd num: "+num2 );
    }
}