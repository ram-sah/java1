import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = input.nextInt();
        System.out.print("Enter B: ");
        int b = input.nextInt();
        int perimeter  = 2*(a+b);
        System.out.println("Perimeter of Rectangle is: "+ perimeter);
    }
}
