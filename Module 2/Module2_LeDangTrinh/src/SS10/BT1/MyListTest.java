package SS10.BT1;

import SS10.BT1.MyList;

public class MyListTest {
    public static void main(String[] args) {
        // create a new MyList object
        MyList<String> myList = new MyList<>();

        // add some elements to the list
        myList.add("apple");
        myList.add("banana");
        myList.add("cherry");

        // remove an element from the list
        myList.remove(1);

        // check if the list contains an element
        boolean containsApple = myList.contains("apple");

        // print out the number of elements in the list
        System.out.println("Number of elements in the list: " + myList.Size());
    }
}
