package day36_Inheritance.phoneTask;

public class Phone {


    public String brand, model, color;
    public int size, price;

    public void setInfo(String model, int size, String color, int price) {
        this.brand= brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void call(long phoneNumber){
        System.out.println(model+" is calling "+phoneNumber);

    }
    public void text (long phoneNumber){
        System.out.println(model+" is texting "+phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }

    /*
     Phone Task:
1.1 Create a class named Phone:
Variables:
brand, model, size, price,
color
Methods:
setInfo()
call(long phoneNumber)
text(long phoneNumber)
toString()
     */
}
