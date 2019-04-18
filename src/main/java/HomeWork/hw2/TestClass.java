package main.java.HomeWork.hw2;

/*
    Task 2.2
 */

public class TestClass {
    // Anonymous class
    static Parent parent = new Parent() {
        @Override
        public void print() {
            super.print();
            System.out.println("Anonymous class");
        }
    };

    // Nested class
    class Nested {
        public void print() {
            System.out.println("Nested class");
        }
    }

    // Static nested class
    static class StaticNested {
        public void print() {
            System.out.println("StaticNested class");
        }
    }

    // Local class method
    void printLocal() {

        //л Local class
        class Local {
            public void print() {
                System.out.println("Local class");
            }
        }
        Local local = new Local();
        local.print();
    }
}

class Parent {
    public void print() {
        System.out.println("Parent class");
    }
}