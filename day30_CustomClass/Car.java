package day30_CustomClass;

public class Car {

    public String brand;
    public String model;
    public String color;
    public int year;
    public int price;


    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public void setInfo (String CarBrand, String CarModel, String CarColor, int CarYear, int CarPrice) {
        brand = CarBrand;
        model = CarModel;
        color = CarColor;
        year = CarYear;
        price = CarPrice;
    }

        public void drive(){
            System.out.println("Driving "+brand+" "+model);
        }
        public void start() {
            System.out.println(brand + " " + model + " has started");
        }
        public void stop(){
            System.out.println(brand+" "+model+" has stopped");



    }

}
