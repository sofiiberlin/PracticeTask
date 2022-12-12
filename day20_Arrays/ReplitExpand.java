package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReplitExpand {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[3];
        int i;
        for (i = 0; i < 3; i++) {
            nums[i] = scan.nextInt();
        }

        //WRITE YOUR CODE BELOW
        System.out.println("Entered values are:");
        for (i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

            int [] expand = new int [nums.length + 3];
            for (int j = 0; j < nums.length; j++) {
                expand[j] = nums[i];

            }
            System.out.println(Arrays.toString(expand));

            }

        }

        }






