public class Main {
    public static void main(String[] args) {

    //Create a main Method for Demonstration
        Animal dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.makeSound();

        System.out.println("\n");

        Animal cat = new Cat();
        cat.eat();
        cat.sleep();
        cat.makeSound();

    }
}