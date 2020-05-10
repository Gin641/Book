public class ProgrammingBook extends Book {
    private String language;
    public ProgrammingBook(){
    }
    public ProgrammingBook(String name, String bookCode, double price, String author,String language){
        super(name,bookCode,price,author);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "ProgrammingBook{" +
                "language='" + language + '\'' +
                ", " + super.toString() + '\'' +
                '}';
    }
}
