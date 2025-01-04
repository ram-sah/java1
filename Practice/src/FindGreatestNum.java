import java.util.Scanner;

public class FindGreatestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("find greatest number: \n");
        System.out.print("Enter num1 ");
        int a = input.nextInt();
        System.out.print("Enter num2 ");
        int b = input.nextInt();
        System.out.print("Enter num3 ");
        int c = input.nextInt();
        if (a >= b && a >= c) {
            System.out.println("Num1 is greater " + a);
        } else if (b >= c && b >= a) {
            System.out.println("num2 is greater: " + b);
        } else System.out.println("num3 is greater: " + c);
    }
}
