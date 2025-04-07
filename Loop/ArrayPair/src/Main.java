public class Main {
    public void printArrayPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i] + " : " + array[j]);
            }
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        int[] arr = {1, 2, 3};
        obj.printArrayPairs(arr);
    }
}
