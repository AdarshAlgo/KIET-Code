package oops;
class Animal6 {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog6 extends Animal6 {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat6 extends Animal6 {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog6 d = new Dog6();
        Cat6 c = new Cat6();

        d.sound();
        d.bark();

        c.sound();
        c.meow();
    }
}