package HomeWork.hw5;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== MyHashMap =====");
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        myHashMap.put("Sviatik", 21);
        myHashMap.put("Misha", 25);
        myHashMap.put("Vova", 25);
        myHashMap.put("Vova1", 1);
        myHashMap.put("Vova2", 2);
        myHashMap.put("Vova4", 4);
        myHashMap.put("Vova5", 5);
        myHashMap.put("Vova8", 8);
        myHashMap.put("Vova9", 9);
        myHashMap.put("Vova10", 10);
        System.out.println(myHashMap);

        System.out.println("get(Misha): " + myHashMap.get("Misha"));
        System.out.println("remove(Vova6): " + myHashMap.remove("Vova6"));
        System.out.println("remove(Vova5): " + myHashMap.remove("Vova5"));
        System.out.println("remove(Vova4): " + myHashMap.remove("Vova4"));
        System.out.println("remove(Vova1): " + myHashMap.remove("Vova1"));
        System.out.println("put(Misha, 10000): ");
        myHashMap.put("Misha", 10000);
        System.out.println(myHashMap);

        System.out.println("Clear myHashMap: ");
        myHashMap.clear();
        System.out.println(myHashMap);
    }
}
