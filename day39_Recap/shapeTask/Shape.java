package day39_Recap.shapeTask;

public class Shape {


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shape(String name) {
        this.name = name;
    }

    public int area(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }


/*
	Shape:
	variables:
			name
	Encapsulate the field
	Add a constructor to set the filed
	Methods:
		area(){}
		perimeter(){}

     */
}
