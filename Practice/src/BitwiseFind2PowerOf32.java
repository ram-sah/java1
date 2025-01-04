import java.util.Scanner;

public class BitwiseFind2PowerOf32 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Bitwise Left Shift 2 power of 32 app ");
        System.out.print("Enter first number: ");
        int num = input.nextInt();
        long result = (long) num << 32;
        System.out.print("Bitwise 2 power of 32 is: " + result);
    }
}
