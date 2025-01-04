import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find your leap year \n");
        System.out.print("inter number: ");
        int num = input.nextInt();
        if (num % 4 == 0 || (num % 100 != 0 && num % 400 == 0)) {
            System.out.println(num + " Your are in leap year.");
        }else System.out.println( num+ " You are not in leap year.");
    }
}
