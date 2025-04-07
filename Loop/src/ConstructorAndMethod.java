public class Constructor {
    public static void main(String[] args) {
        // Constructor initializes the object
        Example obj = new Example("Alice", 25);
        System.out.println("Name: " + obj.name + " and age is: " + obj.age); // Output: Alice
        Example obj2 = new Example("Ram", 47);
        System.out.println("Name: " + obj2.name + " and age is: " + obj2.age); // Output: Alice

        // Method modifies the object
        obj.setName("Bob", 45);
        System.out.println("Name: " + obj.name + ", age: " + obj.age); // Output: Bob
    }

    //In class add 'static' if nested. If not remove static
    static class Example {
        public String name;
        public int age;

        // Constructor (No 'void')
         Example(String name, int age) {
            this.name = name; // Initializes the object
            this.age = age;
        }

        // Method (With 'void')
        public void setName(String name, int age) {
            this.name = name; // Modifies the object's state
            this.age = age;
        }
    }
}
