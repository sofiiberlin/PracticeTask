package day24_CustomMethods_Return;

public class Task1 {
    public static void main(String[] args) {

        String str = "aaabbcccc";
        // str =  ReturnMethodPractice4.removeDuplicates(str);

        //  System.out.println(str);
        str = remove(str);
        System.out.println(str);
    }

    public static String remove(String str) {

        String result = "";
        for (int i = 0; i < str.length() ; i++) {
            char each = str.charAt(i);

            if(!result.contains(""+each)) {

                result += each;
            }
        }
        return(result);







    /*
    1. create a method that can remove duplciated characters from a
string and returns the new value
"aaabbcccc" ===> "abc"
     */
    }
}

