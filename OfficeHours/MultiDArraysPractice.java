package OfficeHours;

import java.lang.reflect.Array;

public class MultiDArraysPractice {
    public static void main(String[] args) {
        
   


    String[][] fruits = new String[3][];
    String [] fruit ={"apple", "banana", "pear"};



    // create a 2d of fruits, has fruits,price,count
    //print --> apple price is 10 dollar, 100 left

    int[][] table = { {1,4,9},{11,4,3},{2,2,3} };
    // get sum of this numbers
    int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum +=table[i][j];
            }
        }
        System.out.println("sum = " + sum);
        }
        
    }



