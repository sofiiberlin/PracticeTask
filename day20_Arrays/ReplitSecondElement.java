package day20_Arrays;

import java.util.Scanner;

public class ReplitSecondElement {

    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();

        }
        int SecondElement = nums[1];
        System.out.println(SecondElement);

        int SecondLast = nums[nums.length -2];

        System.out.println(SecondLast);



        }
    }





/*
Given an `int []` `nums` print the second element and the second to last element in the following format:
 */
