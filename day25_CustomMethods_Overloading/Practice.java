package day25_CustomMethods_Overloading;

public class Practice {
    public static void main(String[] args) {

        int max = maxNumber(10,29);


    }

    public static int maxNumber(int num1, int num2) {
        int result = 0;

        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;

            System.out.println(result);
        }

        return result;





    }



}






