import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Welcome to Multiplication Table");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to get table: ");
        int num = input.nextInt();
        numMulti(num);
    }

    public static void numMulti(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + num * i);
            i++;
        }
    }
}
