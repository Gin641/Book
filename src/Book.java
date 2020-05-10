public class Book {
    private String name;
    private String bookCode;
    private double price;
    private String author;
    public Book(){
    }
    public Book(String name, String bookCode, double price, String author){
        this.name = name;
        this.bookCode = bookCode;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getBookCode() {
        return bookCode;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void display(){
        System.out.printf("%-35s%-10s%-20s%-15s\n",this.name,this.bookCode,this.price,this.author);
    }
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", bookCode='" + bookCode + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
