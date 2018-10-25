import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class MyArrayListTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void add() {
        //Arrange
        MyList<Integer> listInt = new MyArrayList<Integer>();
        //Act
        listInt.add(1);
        //Assert
        Assert.assertTrue(1 == listInt.size());
    }

    @Test
    public void addAll() {

        Collection<Integer> newColl = new ArrayList<>();
        newColl.add(1);
        newColl.add(2);

        MyList myList = new MyArrayList();
        myList.add(3);
        myList.addAll(newColl);

        Assert.assertTrue(3 == myList.size());

    }

    @Test
    public void getFirst() {
        MyList<Integer> myList = new MyArrayList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);

        //Act
        int res = myList.getFirst();
        //Assert

        Assert.assertEquals(1, res);


    }

    @Test
    public void getLast() {
        MyList<Integer> myList = new MyArrayList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);

        //Act
        int res = myList.getLast();
        //Assert

        Assert.assertEquals(3, res);

    }

    @Test
    public void get() {

        MyList<Integer> myList = new MyArrayList<Integer>();
        myList.add(10);
        myList.add(20);
        myList.add(30);

        //Act
        int res = myList.get(1);
        //Assert

        Assert.assertEquals(20, res);


    }

    @Test
    public void indexOf() {
        MyList<Integer> myList = new MyArrayList<Integer>();
        myList.add(10);
        myList.add(20);
        myList.add(30);

        //Act
        int res = myList.indexOf(20);
        //Assert

        Assert.assertEquals(1, res);

    }

    @Test
    public void remove() {
        MyList<Integer> myList = new MyArrayList<Integer>();
        myList.add(10);
        myList.add(20);
        myList.add(30);

        //Act
        myList.remove(1);
        //Assert

        Assert.assertTrue(2 == myList.size());


    }

    @Test
    public void set() {
        MyList<Integer> myList = new MyArrayList<Integer>();
        myList.add(10);
        myList.add(20);
        myList.add(30);

        //Act
        myList.set(1, 40);
        //Assert
        Assert.assertTrue(40 == myList.get(1));
    }


}