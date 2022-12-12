package day28_ArrayList;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {

        ArrayList<Integer> maxNum = new ArrayList<>();
        maxNum.add(1);
        maxNum.add(2);
        maxNum.add(3);
        maxNum.add(4);
        maxNum.add(5);
        System.out.println(maxNum);

        int max =maxNum.get(0);


        for (Integer each : maxNum) {
            if(each > max){
                max = each;
            }


            System.out.println("max = " + max);

        }

        /*
        5. Write a program that can find the maximum number from an ArrayList of
integers
Ex:
list = [1,2,3,4,5];
output:
5
         */
    }
}
