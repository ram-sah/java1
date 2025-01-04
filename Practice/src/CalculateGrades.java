import java.util.Scanner;

public class CalculateGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Grade calculation app: \n");
        System.out.print("Enter your marks : ");
        int num = input.nextInt();
        if (num >= 90 && num <=100) {
            System.out.println("your Grade is: 'A' ");
        } else if (num >= 75) {
            System.out.println(" grade : 'B' ");
        } else if (num >= 60) {
            System.out.println(" Grade 'C' ");
        } else if (num < 60) {
            System.out.println(" Grade 'f' ");
        }
    }
}
