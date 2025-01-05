public class Patterns {
    public static void main(String[] args) {
        pattern1();
        pattern2();
    }

    public static void pattern1() {
        int num = 1;
        while (num <= 5) {
            int i = 0;
            while (i < num) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            num++;
        }
    }

    //    pattern 2
    public static void pattern2() {
        System.out.println("Printing 2nd pattern: ");
        int num = 5;
        while (num >= 1) {
            int i = 1;
            while (i <= num) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            num--;
        }
    }
}
