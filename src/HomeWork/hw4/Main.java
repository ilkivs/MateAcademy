package HomeWork.hw4;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("Привет");
        myLinkedList.add("мой");
        myLinkedList.add("друг");
        myLinkedList.add("Пока");
        myLinkedList.add("addNode", 0);
        myLinkedList.add("addNode2", 5);
        System.out.println(myLinkedList.get(5));
        System.out.println(myLinkedList.isEmpty());
        System.out.println("size = " + myLinkedList.size());
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.remove("addNode2"));
        System.out.println(myLinkedList);

        MyLinkedList<String> myLinkedList2 = new MyLinkedList<>();
        myLinkedList2.add("I");
        myLinkedList2.add("am");
        myLinkedList2.add("new");
        myLinkedList2.add("LinkedList");
        myLinkedList.addAll(myLinkedList2);
        System.out.println(myLinkedList);
    }
}
