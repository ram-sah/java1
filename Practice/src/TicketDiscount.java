import java.util.Scanner;

public class TicketDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ticket discount application: \n");
        System.out.println("Enter age: ");
        int age = input.nextInt();
        System.out.println(" Are you female press '1' for yes '0' no? ");
        int gen = input.nextInt();
        boolean isFem = (gen == 1);
        if (age < 5) {
            System.out.println("Your discount is : 75%");
        } else if (isFem) {
            System.out.println("Your discount is: 50%");
        } else if (age >= 60 && !isFem) {
            System.out.println("Your discount 25%");
        } else System.out.println("Sorry no discount");
        input.close();
    }
}
