//Create a base class Animal with instance variable name and age as well as a method makeSound() that prints "Some generic animal sound".
//Then, create two subclasses: Dog and Cat, both of which override the makeSound() method.
//The Dog class should print "Dog barks", while the Cat class should print "Cat meows".
//In the main method, create objects of both Dog and Cat, call their makeSound() methods, also initialize each animal name and age using super.

class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("Cat meows");
    }
}


public class LabTask1 {
    public static void main(String[] args) {
        Dog dog = new Dog("Kalu", 3);
        Cat cat = new Cat("Dholu", 2);

        dog.makeSound();
        cat.makeSound();

        System.out.println(dog.name + " is " + dog.age + " years old.");
        System.out.println(cat.name + " is " + cat.age + " years old.");
    }
}