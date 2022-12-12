package day24_CustomMethods_Return;

public class Task2 {

    public static int max(int[] array) {
        int max = array[0];
        for (int each : array) {
            if(each>max){
                max=each;
            }
        }
        return max;
    }
    /*
    2. create a method that can return the maximum number from an array
of integers
     */
}

