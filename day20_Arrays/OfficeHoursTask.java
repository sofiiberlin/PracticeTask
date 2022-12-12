package day20_Arrays;

import java.util.Arrays;

public class OfficeHoursTask {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for(int i=0; i<10; i++){
            numbers[i] =i;
        }
        for(int i=9; i >=0; i--){
            numbers[9-i]=i;
        }
        System.out.println(Arrays.toString(numbers));
    }



}
