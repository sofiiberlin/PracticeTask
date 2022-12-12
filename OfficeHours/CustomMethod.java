package OfficeHours;

public class CustomMethod {
    public static void main(String[] args) {
        countSpaces(" this is a java office hour");
        investment(2,25,2025);
    }

    public static void countSpaces(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }

        }
        System.out.println(count);
    }
        // write a java method to calculate total money in your bank account
        // mehtod receives 3 arguents: original amount, rate, year.
        public static void investment(double amount, double rate, int year) {
            // amount = amount + amount*rate
            int count = 0;
            for (int i = 0; i < year; i++) {
                amount += amount + amount * rate;
                count++;
            }
            System.out.println("total amount is =" + amount);

            // amount = amount + amount*rate

        }
            public  static  boolean leapYear(int year){
                boolean leap=false;
                if (year%4==0){
                    leap=true;
                }else {
                    leap=false;
                }
                return leap;
            }

        }
    



