/*
- Java ArrayList class uses a dynamic array for storing the elements. 
- It is like an array, but there is no size limit. 
- We can add or remove elements anytime. So, it is much more flexible than the traditional array. 
- It is found in the java.util package. 
- It is like the Vector in C++.
- Java ArrayList class can contain duplicate elements.
- Java ArrayList class maintains insertion order.
- Java ArrayList class is non synchronized.
- Java ArrayList allows random access because the array works on an index basis.
- In ArrayList, manipulation is a little bit slower than the LinkedList in Java because a lot of shifting needs to occur if  any element is removed from the array list.
- We can not create an array list of the primitive types, such as int, float, char, etc. It is required to use the required wrapper class in such cases. Like <int> => <Integer>

*/
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayLists{
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);

        //Array List Declaration
        ArrayList <Integer> arrInt =  new ArrayList<Integer>();
        ArrayList <String> arrString =  new ArrayList<String>();
        ArrayList <Double> arrDouble =  new ArrayList<Double>();

       /* ArrayList() --->	It is used to build an empty array list.
        ArrayList(Collection<? extends E> c)  --->	It is used to build an array list that is initialized with the elements of the collection c.
        ArrayList(int capacity) ---> It is used to build an array list that has the specified initial capacity.
        */
        
        // Methods of array list 
        // 1. add()
        arrInt.add(34);
        arrString.add("Captian America");
        arrDouble.add(3.245);
        arrInt.add(74);
        arrString.add("Tony Stark");
        arrDouble.add(7.3456);
        arrInt.add(75);
        arrString.add("Hulk");
        arrDouble.add(4325.435);

        System.out.println("Interger ArrayList: " + arrInt);
        System.out.println("String ArrayList: " + arrString);
        System.out.println("Double ArrayList: " + arrDouble);

    }
}