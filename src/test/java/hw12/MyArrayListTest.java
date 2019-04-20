package hw12;

import HomeWork.hw4.MyArrayList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MyArrayListTest<T> extends Assert {

    private MyArrayList<String> list;

    @Rule
    public final ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() {
        list = new MyArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
    }

    @Test
    public void addTest() {
        Assert.assertEquals(3, list.size());
        thrown.expect(IndexOutOfBoundsException.class);
        String str = list.get(3);
        list.add("Forth");
        Assert.assertEquals(4, list.size());
        Assert.assertEquals("Forth", list.get(3));
    }

    @Test
    public void addByIndexTest() {
        Assert.assertEquals("Second", list.get(1));
        list.add("NewSecond", 1);
        Assert.assertEquals("NewSecond", list.get(1));
        Assert.assertEquals("Second", list.get(2));
    }

    @Test
    public void addAllTest() {
        MyArrayList<String> newList = new MyArrayList<>();
        newList.add("111");
        newList.add("222");
        list.addAll(newList);
        Assert.assertEquals("111",list.get(3));
        Assert.assertEquals("222",list.get(4));
    }

    @Test
    public void getTest() {
        Assert.assertEquals("First", list.get(0));
    }

    @Test
    public void setTest() {
        Assert.assertEquals("Second" , list.get(1));
        list.set("NewSecond", 1);
        Assert.assertEquals("NewSecond" , list.get(1));
    }

    @Test
    public void removeByValueTest() {
        list.remove("First");
        Assert.assertEquals("Second", list.get(0));
    }

    @Test
    public void removeByIndexTest() {
        list.remove(1);
        Assert.assertEquals("Third", list.get(1));
    }

    @Test
    public void sizeTest() {
        Assert.assertEquals(3, list.size());
    }

    @Test
    public void isEmptyTest() {
        list.remove(0);
        list.remove(0);
        list.remove(0);
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void toArrayTest() {
        String[] expectedArr = new String[] {"First", "Second", "Third"};
        Assert.assertEquals(expectedArr, list.toArray());
    }

    @Test
    public void toStringTest() {
        String expected = "[First, Second, Third]";
        Assert.assertEquals(expected, list.toString());
    }
}