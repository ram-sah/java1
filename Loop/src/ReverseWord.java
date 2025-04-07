import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Reverse app:\n");
        System.out.println("Please enter word: ");
        String word = input.nextLine();

        //passing input argument to function
        String reverseWord = reverseWord(word);
        System.out.println("Reversed word: " + reverseWord);
    }

//define method inside class
    public static String reverseWord(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        return reverse;
    }
}