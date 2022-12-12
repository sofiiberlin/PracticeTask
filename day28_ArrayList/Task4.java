package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        String [] arr = {"A", "B", "C"};

        String [] arr1 = {"D", "E", "F", "G"};

        ArrayList<String> combine = new ArrayList<>(Arrays.asList(arr));
        combine.addAll(Arrays.asList(arr1));
        System.out.println(combine);









        /*
        4. write a program that can combine two String arrays into one arrayList
            ex:
                arr1 = {"A", "B", "C"};
                arr2 = {"D", "E", "F", "G"};
                list ==> {"A", "B", "C", "D", "E",
"F", "G"}
         */
    }
}
