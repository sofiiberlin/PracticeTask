package day28_ArrayList;

public class ReverseWord {
    public static void main(String[] args) {
    String [] words = {"Stressed", "Parts", "Straw", "Keep", "Wolf"};


        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String revWord = "";


           for (int j = word.length() - 1; j >= 0; j--) {
               revWord = revWord + word.charAt(j);
              revWord = revWord.toLowerCase();
              revWord = revWord.replace(revWord.substring(0,1), revWord.substring(0,1).toUpperCase());

           }
            System.out.print(revWord + " ");
        }


            }
        }




