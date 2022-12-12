package day36_Inheritance.phoneTask;

import day36_Inheritance.phoneTask.Phone;

public class Samsung extends Phone {

    public void freeze(){
        System.out.println(brand+" "+model+" is freezing");
    }


    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
    /*
    1.3 Create a sub class of Phone named Samsung:
Variables:
brand, model, size, price,
color
Methods:
setInfo()
call(long phoneNumber)
text(long phoneNumber)
freeze()
toString()
     */
}
