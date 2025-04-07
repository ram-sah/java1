public class InterfaceAnimal {
    public static void main(String[] args) {
        // Create and use Dog instance
        Animal myDog = new Dog();
        myDog.eat();
        myDog.sleep();

        // Create and use Cat instance
        Animal myCat = new Cat();
        myCat.eat();
        myCat.sleep();
    }

    // Interface declaration
    interface Animal {
        void eat();
        void sleep();
    }

    // Dog implementation of the Animal interface
    static class Dog implements Animal {
        public void eat() {
            System.out.println("Dog is Eating");
        }

        public void sleep() {
            System.out.println("Dog is Sleeping");
        }
    }

    // Cat implementation of the Animal interface
    static class Cat implements Animal {
        public void eat() {
            System.out.println("Cat is Eating");
        }

        public void sleep() {
            System.out.println("Cat is Sleeping");
        }
    }
}
