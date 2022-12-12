package day37_Inheritance.book;

public class Ebook extends Book{

    public double size;
    public int pages;

    public Ebook(String title, String type, String author, double price) {
        super(title, type, author, price);
    }


    public void readBook(){
        System.out.println("I am reading the " + getTitle() + " by " + getAuthor());
    }

    public String toString() {
        return "Ebook{" +
                "size=" + size +
                ", pages=" + pages +
                '}';
    }
}
