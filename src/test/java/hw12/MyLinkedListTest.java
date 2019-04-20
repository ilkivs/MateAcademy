package hw12;

import HomeWork.hw4.MyArrayList;
import HomeWork.hw4.MyLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MyLinkedListTest {

    private MyLinkedList<Integer> list;

    @Rule
    public final ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() {
        list = new MyLinkedList<>();
        list.add(100);
        list.add(200);
        list.add(300);
    }

    @Test
    public void addTest() {
        Assert.assertEquals(3, list.size());
        thrown.expect(NullPointerException.class);
        int item = list.get(3);
        list.add(400);
        Assert.assertEquals(4, list.size());
        Assert.assertEquals(400, (int) list.get(3));
    }

    @Test
    public void addByIndexTest() {
        Assert.assertEquals(200, (int) list.get(1));
        list.add(250, 1);
        Assert.assertEquals(250, (int) list.get(1));
        Assert.assertEquals(200, (int) list.get(2));
    }

    @Test
    public void addAllTest() {
        MyArrayList<Integer> newList = new MyArrayList<>();
        newList.add(150);
        newList.add(250);
        list.addAll(newList);
        Assert.assertEquals(150,(int) list.get(3));
        Assert.assertEquals(250,(int) list.get(4));
    }

    @Test
    public void getTest() {
        Assert.assertEquals(100,(int)  list.get(0));
    }

    @Test
    public void setTest() {
        Assert.assertEquals(200 ,(int)  list.get(1));
        list.set(250, 1);
        Assert.assertEquals(250 , (int) list.get(1));
    }

    @Test
    public void removeByValueTest() throws Exception {
        list.remove(Integer.valueOf(100));
        Assert.assertEquals(200, (int) list.get(0));
    }

    @Test
    public void removeByIndexTest() throws Exception {
        list.remove(1);
        Assert.assertEquals(300,(int)  list.get(1));
    }

    @Test
    public void sizeTest() {
        Assert.assertEquals(3, list.size());
    }

    @Test
    public void isEmptyTest() throws Exception {
        list.remove(0);
        list.remove(0);
        list.remove(0);
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void toArrayTest() {
        Integer[] expectedArr = new Integer[] {100, 200, 300};
        Assert.assertEquals(expectedArr, list.toArray());
    }

    @Test
    public void toStringTest() {
        String expected = "[100, 200, 300]";
        Assert.assertEquals(expected, list.toString());
    }
}