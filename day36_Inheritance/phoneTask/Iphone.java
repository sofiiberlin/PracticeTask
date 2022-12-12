package day36_Inheritance.phoneTask;

public class Iphone extends Phone {

    public void faceTime(long phoneNumber){
        System.out.println(model + "is facetiming with" + phoneNumber);
    }
    public void facetime (String email){
        System.out.println(model + "is facetiming through" + email);
    }

    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }

    /*
    Create a sub class of Phone named IPhone:
Variables:
brand, model, size, price,
color
Methods:
setInfo()
call(long phoneNumber)
text(long phoneNumber)
faceTime(long phoneNumber)
faceTime(String email)
toString()
     */
}
