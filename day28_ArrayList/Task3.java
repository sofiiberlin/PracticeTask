package day28_ArrayList;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {

        ArrayList<Integer> multEachOdd = new ArrayList<>();
        multEachOdd.add(1);
        multEachOdd.add(2);
        multEachOdd.add(3);
        multEachOdd.add(4);
        multEachOdd.add(5);

        System.out.println(multEachOdd);

        for (int i = 0; i < multEachOdd.size(); i++) {
            if((i % 2) == 0) {
                System.out.println(i * 2);
            }else{
                continue;
            }
            System.out.println(multEachOdd);

        }
        /*
        3. write a program that can multiply each odd number by 2
            ex: list = [1,2,3,4,5];
                output: [2,2,6,4,10]
         */
    }
}
