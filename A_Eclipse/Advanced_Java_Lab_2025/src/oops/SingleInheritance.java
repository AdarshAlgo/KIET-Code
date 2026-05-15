package oops;

class Animal5 {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog5 extends Animal5 {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog5 d = new Dog5();
        d.sound();
        d.bark();
    }
}