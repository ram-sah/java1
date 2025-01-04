import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==Area of triangle :");
        System.out.print(" Enter Base: ");
        int b = input.nextInt();
        System.out.print("Enter height of triangle: ");
        int h = input.nextInt();
        float area = ((b*h)/2);
        System.out.println(" Area of triangle is : "+ b +" and " + h +" is : " + area + "cms2 ");
    }
}
