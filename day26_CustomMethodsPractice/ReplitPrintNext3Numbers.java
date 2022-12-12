package day26_CustomMethodsPractice;

import java.util.Scanner;

public class ReplitPrintNext3Numbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number:");
        int num = inp.nextInt();

        next3(num);
    }

    // DO NOT TOUCH ABOVE:
    public static void next3(int num){
        System.out.println();
        System.out.println("next3: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(++num + " ");

        }


}
}
