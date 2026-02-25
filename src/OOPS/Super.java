
// The super keyword in Java is used in a subclass to refer to its immediate parent class,
// allowing the subclass to access parent class methods,
// variables, and constructors that are hidden or overridden
package OOPS;

class Animals {
    Animals() {
        System.out.println("Animal constructor called");
    }
}

class Dog extends Animals {
    Dog() {
        super();  // Parent class constructor call
        System.out.println("Dog constructor called");
    }
}

public class Super {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
