import java.util.Scanner;

public class BitwiseNotComplement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        int result = ~num;
        System.out.print("Your not/ complement result: "+ result);;
    }
}