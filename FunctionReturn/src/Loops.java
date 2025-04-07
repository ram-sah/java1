public class WhileLoop {
    public static void main(String[] args) {
        int num = 0;
        while (num <= 10) {
            System.out.println("num: " + num);
            num++;
        }
        //1. calling evenNumber loop
        evenNumbers();
        //2. calling oddNumber
        oddNumbers();
        //3. calling startStr
        startChar('a');
        //4. calling numbers of array
        arrNumber();
    }

    public static void evenNumbers() {
        System.out.println("1. Even numbers: ");
        int num = -100;
        while (num <= 100) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        }
    }

    public static void oddNumbers() {
        System.out.println("2. oddNumbers numbers: ");
        int num = 1;
        do {
            if (num % 2 != 0) {
                System.out.println("Odd numbers:" + num);
            }
            num++;
        } while (num < 49);
    }

    //write a do-while loop that prints the 26 letters of the alphabet
    public static void startChar(char letter) {
        System.out.println("3. 26 Alphabets are as: ");
        do {
            System.out.println(letter);
            letter++;
        } while (letter <= 'z');
    }

    //write a function to print number
    public static void arrNumber() {
        System.out.print("4. Print elements of array: ");
        int[] arr = {2, 3, 4, 5, 61, 9, 7, 8};
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
