package HomeWork.hw2;

public class Task_2_2 {
    //анонімний клас
    static Parent parent = new Parent() {
        @Override
        public void print() {
            super.print();
            System.out.println("Anonymous class");
        }
    };

    //вложений клас
    class Nested {
        public void print() {
            System.out.println("Nested class");
        }
    }

    //внутрішній статичний клас
    static class StaticNested {
        public void print() {
            System.out.println("StaticNested class");
        }
    }

    //метод для локального класу
    void printLocal() {

        //локальний клас
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