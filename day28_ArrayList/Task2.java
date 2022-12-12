package day28_ArrayList;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {

        ArrayList<Integer> swapElements = new ArrayList<>();
        swapElements.add(1);
        swapElements.add(2);
        swapElements.add(3);
        swapElements.add(4);
        swapElements.add(5);
        System.out.println(swapElements);

       int a = swapElements.indexOf(1);
       int b = swapElements.lastIndexOf(5);

      int swap = swapElements.set(0,5);
      int swap1 = swapElements.set(4,1);
        System.out.println(swapElements);



        }



        /*
        . write a program that can swap the first and last elements of an
integer arraylist
            ex:
                list = [1,2,3,4,5];
                output: [5,2,3,4,1];
         */
    }

