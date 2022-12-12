package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 3, 4, 5, 6, 7, 7, 7};
        int[] unique = uniqueElements(array);
        System.out.println(Arrays.toString(unique));
    }

    // return unique element of Array as a new Array
    public static int[] uniqueElements(int[] array) {
        int[] result = {}; //new int[0]
        for (int each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // if the frequency is one, the element is unoque
                result = ArraysUtility.addElement(result, each);
            }

        }
        return result;
    }

    // return unique element of Array as a new Array
    public static double[] uniqueElements(double[] array) {
        double[] result = {}; //new int[0]
        for (double each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // if the frequency is one, the element is unoque
                result = ArraysUtility.addElement(result, each);
            }

        }
        return result;
    }

    // return unique element of Array as a new Array
    public static char[] uniqueElements(char[] array) {
        char[] result = {}; //new int[0]
        for (char each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // if the frequency is one, the element is unoque
                result = ArraysUtility.addElement(result, each);
            }

        }
        return result;
    }

    // return unique element of Array as a new Array
    public static String[] uniqueElements(String[] array) {
        String[] result = {}; //new int[0]
        for (String each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // if the frequency is one, the element is unoque
                result = ArraysUtility.addElement(result, each);
            }

        }
        return result;
    }
}
        
    

