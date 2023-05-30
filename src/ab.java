
    abstract class Animal {
        public abstract void sound();
    }

    // Concrete classes
    class Dog extends Animal {
        public void sound() {
            System.out.println("Woof");
        }
    }

    class Cat extends Animal {
        public void sound() {
            System.out.println("Meow");
        }
    }

    // Usage
    public class ab{
        public static void main(String[] args) {
            Animal dog = new Dog();
            Animal cat = new Cat();

            dog.sound();  // Output: Woof
            cat.sound();  // Output: Meow
        }
    }


