package day20_Arrays;

import java.util.Scanner;

public class ReplitFirstAndLastCharacterOfWord {

    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        //WRITE YOUR CODE BELOW:


        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].charAt(0));
            System.out.print(words[i].charAt(words[i].length()-1));
            System.out.println();





        }



    }
}
