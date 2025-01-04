import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Compound interest calculation:");
        System.out.print("Enter amount: ");
        float p = input.nextFloat();
        System.out.print("Enter Rate: ");
        float r = input.nextFloat();
        System.out.print("Enter time: ");
        float t = input.nextFloat();
        double si =(p * Math.pow((1+r/100), t));
        System.out.println(" Compound Interest : " + si);
    }
}
