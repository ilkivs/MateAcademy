package hw12;

import HomeWork.hw5.MyHashMap;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyHashMapTest {

    private MyHashMap<Integer, String> map;

    @Before
    public void setUp() throws Exception {
        map = new MyHashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
    }

    @Test
    public void putTest() {
        map.put(4, "Four");
        Assert.assertEquals(4, map.size());
        Assert.assertEquals("Four", map.get(4));
    }

    @Test
    public void getTest() {
        Assert.assertEquals("Two", map.get(2));
    }

    @Test
    public void removeTest() {
        map.remove(3);
        Assert.assertEquals(2, map.size());
        Assert.assertNull(map.get(3));
    }

    @Test
    public void clearTest() {
        map.clear();
        Assert.assertEquals(0, map.size());
        Assert.assertNull(map.get(1));
    }

    @Test
    public void sizeTest() {
        Assert.assertEquals(3, map.size());
    }

    @Test
    public void toStringTest() {
        String expected = "MyHashMap {nodes = \n" +
                "[1] : Node {hashCode=1, key=1, value=One, next=null}\n" +
                "[2] : Node {hashCode=2, key=2, value=Two, next=null}\n" +
                "[3] : Node {hashCode=3, key=3, value=Three, next=null}\n" +
                "size=3}";
        Assert.assertEquals(expected, map.toString());
    }
}