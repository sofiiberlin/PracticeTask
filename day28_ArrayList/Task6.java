package day28_ArrayList;

import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args) {

    ArrayList<Integer> minNum = new ArrayList<>();
        minNum.add(1);
        minNum.add(2);
        minNum.add(3);
        minNum.add(4);
        int min = minNum.get(0);
        for (Integer each : minNum) {
            if(each < min){
                min = each;
            }


        }
        System.out.println("min = " + min);


    /*
    6. Write a program that can find the minimum number from an ArrayList of
integers
Ex:
list = [1,2,3,4,5];
output:
1
     */
}
 }
