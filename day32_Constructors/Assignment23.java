package day32_Constructors;

import java.util.ArrayList;

public class Assignment23 {
    public static void main(String[] args) {


    ArrayList <String> str = new ArrayList<>();
    str.add("j");
        str.add(0,"1");
        str.add("i");
        str.add(2, "5");
        str.remove(1);
        str.add("e");
        str.add("i");
        str.remove("i");
        System.out.println(str);
}
}