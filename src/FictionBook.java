public class FictionBook extends Book{
    private String category;
    public FictionBook(){
    }
    public FictionBook(String name, String bookCode, double price, String author, String category){
        super(name,bookCode,price,author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "FictionBook{" +
                "category='" + category + '\'' +
                ", " + super.toString() + '\'' +
                '}';
    }
}
