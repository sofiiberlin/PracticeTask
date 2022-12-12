package day25_CustomMethods_Overloading;

public class SumOfNumbers {
    public static void main(String[] args) {
      int sum  = sumOF2Numbers(2,4);
        System.out.println(sum);

      int sum2 =   sumOf3Numbers(3,4,5);
        System.out.println(sum2);
        int sum3 = sumOf4Numbers(5,5,5,5);
        System.out.println(sum3);
    }

    public static int sumOF2Numbers (int num1, int num2){
        return num1+num2;
    }

    public static int sumOf3Numbers(int num3, int num4, int num5) {
        return num3+num4+num5;
    }
    public static int sumOf4Numbers (int num6, int num7, int num8, int num9){
        return num6+num7+num8+num9;
    }


    /*
Task1:
	    1. create a method that can find the sum of two numbers
	                    method name: sumOf2Numbers
	    2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers
	    3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers
 */
}
