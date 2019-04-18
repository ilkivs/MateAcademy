package HomeWork.hw4;

public class Main {

    public static void main(String[] args) {
        System.out.println("===== MyLinkedList =====");
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("Hi!");
        myLinkedList.add("My");
        myLinkedList.add("name");
        myLinkedList.add("is");
        myLinkedList.add("Sviatoslav");
        myLinkedList.add("added", 0);
        System.out.println(myLinkedList);
        System.out.println("get(5) = " + myLinkedList.get(5));
        System.out.println("isEmpty = " + myLinkedList.isEmpty());
        System.out.println("size = " + myLinkedList.size());
        System.out.println("Remove " + myLinkedList.remove("is"));
        System.out.println(myLinkedList);

        MyLinkedList<String> myLinkedList2 = new MyLinkedList<>();
        myLinkedList2.add("I");
        myLinkedList2.add("am");
        myLinkedList2.add("new");
        myLinkedList2.add("LinkedList");
        myLinkedList.addAll(myLinkedList2);
        System.out.println("addAll");
        System.out.println(myLinkedList);

        System.out.println("\n===== MyArrayList =====");
        MyArrayList<String> myArrayList1 = new MyArrayList<>();
        MyArrayList<String> myArrayList2 = new MyArrayList<>();
        for (int i = 0; i < 10; i++) {
            myArrayList1.add(String.valueOf(i));
            myArrayList2.add(String.valueOf(-i));
        }
        myArrayList1.add("100", 10);
        System.out.println(myArrayList1);
        System.out.println("addAll");
        myArrayList1.addAll(myArrayList2);
        System.out.println(myArrayList1);
        myArrayList1.add("added", 5);
        System.out.println(myArrayList1);

        System.out.println("get(7) = " + myArrayList1.get(7));
        System.out.println("isEmpty = " + myArrayList1.isEmpty());
        System.out.println("size = " + myArrayList1.size());
        System.out.println("Remove " + myArrayList1.remove(14));
        System.out.println(myArrayList1);
    }
}
