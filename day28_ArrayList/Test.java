package day28_ArrayList;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

            String[] wordList = {"Stressed", "Parts", "Straw", "Keep", "Wolf"};
            for (int i = 0; i < wordList.length; i++) {
                String word = wordList[i]; // Get the word from array
                word = new StringBuilder(word).reverse().toString(); // use StringBuilder to reverse the word
                wordList[i] = word; // put word back in the array
                word = word.toLowerCase();
                word = word.replace(word.substring(0,1), word.substring(0,1).toUpperCase());
                wordList[i] = word; // put word back in the array
            }

            System.out.println(Arrays.asList(wordList));
        }
    }



