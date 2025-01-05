public class FunctionParameter {
    public static void main(String[] args) {
        System.out.println("Welcome to sum ");
        System.out.println("Sum of 2 numbers is: " + sumNumber(4, 6));
        System.out.println("Sum of 2 numbers is: " + sumNumber(14, 10));
    }

    public static int sumNumber(int num1, int num2) {
        System.out.println("First number received:" + num1);
        System.out.println("Second number received:" + num2);

        return num1 + num2;
    }
}
