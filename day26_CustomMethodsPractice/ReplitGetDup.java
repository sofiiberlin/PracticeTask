package day26_CustomMethodsPractice;

import java.util.Scanner;

public class ReplitGetDup {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(getDup(strs));

    }
    public static int getDup(String[] arr) {
        String[] result = new String[arr.length + 1];
        int count = 0;
        int i = 0;
        for (String each : arr) {
            result[i++] = each;

        }

        return count;

    }

}

