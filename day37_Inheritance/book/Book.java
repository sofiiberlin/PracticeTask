package day37_Inheritance.book;

public class Book {

        private String title, type, author;
        private double price;

        public Book(String title, String type, String author, double price) {
            setTitle(title);
            setType(type);
            setAuthor(author);
            setPrice(price);
        }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
            if(price<=0){
                System.out.println("Invalid price");
                System.exit(0);
            }
        this.price = price;
    }

    public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", type='" + type + '\'' +
                    ", author='" + author + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
