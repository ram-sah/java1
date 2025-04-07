import java.util.stream.IntStream;
public class IntStreamClass {
    public static void main(String[] args){
        IntStream intstream = IntStream.of(1,2,3,4,5);
        int sum = intstream.sum();
        System.out.println("Sum: "+ sum);
    }
}
