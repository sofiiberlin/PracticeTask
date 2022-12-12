package day37_Inheritance.book;

public class AudioBook extends Book{

    private int length;
    private String narrator;

    public AudioBook(String title, String type, String author, double price) {
        super(title, type, author, price);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    public void listen(){
        System.out.println("I am listening to " + getTitle() + " by " + getAuthor() + " narrated by " + narrator);
    }

    public String toString() {
        return "AudioBook{" +
                "length=" + length +
                ", narrator='" + narrator + '\'' +
                '}';
    }
}
