public class Unary {
    public static void main(String[] args) {
        int x = 4;
        int y = -x;
        int z = - y;
        x+=x;
//        x++;
//        System.out.println("Y value: " +y);
//        System.out.println(z);
        int p=5;
        System.out.println("p++: " +p++);
        System.out.println("++p"+ (++p));
        System.out.println(x++);
        System.out.println(x);
        int q = 10;
        System.out.println("--q: "+ --q);
        System.out.println(q);
        System.out.println("q--: "+ q--);
        System.out.println(q);

    }
}
