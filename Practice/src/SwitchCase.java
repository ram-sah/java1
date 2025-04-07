public class SwitchCase {
    public static void main(String[] args) {
        int i = 0;
        while (i != 4) {
            switch (i) {
                case 0:
                    System.out.print(0);
                    break;
                case 1:
                    System.out.print(1);
                default:
                    System.out.print("X");
            }
            i++;
        }
    }
}
