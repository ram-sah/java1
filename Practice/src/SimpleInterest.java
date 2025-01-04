import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Simple interest calculation application\n");
        System.out.print("Enter principal: ");
        float p = input.nextFloat();
        System.out.print("Enter Time: ");
        float t = input.nextFloat();
        System.out.print("Enter Rate: ");
        float r = input.nextFloat();
        System.out.println("Simple interest: " + (p*t*r)/100 );

    }
}
