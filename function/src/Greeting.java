public class Greeting {
    public static void main(String[] args) {
        System.out.println("Calling inside main function");
        greeting();
        System.out.println("Method Calling complete");
    }
    public static void greeting() {
        System.out.println("Hello, World! Good morning");
    }
}