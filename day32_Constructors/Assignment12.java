package day32_Constructors;

import java.util.Arrays;

public class Assignment12 {
    public static int[] mathod6 (String str){

        int [] arr = new int[str.length()];
        int n= 10;
        for(int i=0; i<arr.length; i++){
            if(n==20 || n == 50 || n== 70){
                continue;
            }
            arr[i] =n;
            n*=10;
        }
        return  arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mathod6("mark")));
    }
}
