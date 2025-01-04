import java.util.Scanner;

public class Arithmetic2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = input.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        int sub = num1 - num2;
        int product = num1 * num2;
        int division = num1 / num2;
        int module = num1 % num2;
        System.out.println("Sum: "+ sum +"\nSub: "+ sub + "\nproduct: "+ product + "\nDivision: "+ division + "\nModule: "+module);
    }
}
