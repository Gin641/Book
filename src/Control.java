import java.util.ArrayList;
import java.util.Scanner;

public class Control {
    ArrayList<FictionBook> fictionBooks = new ArrayList<>();
    ArrayList<ProgrammingBook> programmingBooks = new ArrayList<>();
    private String nameFind = "";
    Scanner scanner = new Scanner(System.in);
    public void inputBook(){
        programmingBooks.add(programmingBook1);
        programmingBooks.add(programmingBook2);
        programmingBooks.add(programmingBook3);
        programmingBooks.add(programmingBook4);
        programmingBooks.add(programmingBook5);
        fictionBooks.add(fictionBook1);
        fictionBooks.add(fictionBook2);
        fictionBooks.add(fictionBook3);
        fictionBooks.add(fictionBook4);
        fictionBooks.add(fictionBook5);
    }
    ProgrammingBook programmingBook1 = new ProgrammingBook("Sách lập trình java tập 1", "01",180000.0,"FPT","Java");
    ProgrammingBook programmingBook2 = new ProgrammingBook("Sách lập trình java tập 2", "02", 180000.0,"FPT","Java");
    ProgrammingBook programmingBook3 = new ProgrammingBook("Lập trình hướng đối tượng java core", "03", 189000.0, "NEOS.THÀNH","Java");
    ProgrammingBook programmingBook4 = new ProgrammingBook("Nền tàng lập trình java","04",399000.0,"Nguyễn Thanh Tân","Java");
    ProgrammingBook programmingBook5 = new ProgrammingBook("Lập trình cơ bản PHP","05",140000.0,"FPT","PHP");
    FictionBook fictionBook1 = new FictionBook("5cm/s","01",36000.0,"Shinkai Makoto","Tiểu thuyết");
    FictionBook fictionBook2 = new FictionBook("Your Name","02",45000.0,"Shinkai Makoto","Tiểu thuyết");
    FictionBook fictionBook3 = new FictionBook("One piece Tập 1","03",30000.0,"Oda Eiichiro","Truyện tranh");
    FictionBook fictionBook4 = new FictionBook("Kimetsu no Yaiba","04",30000.0,"Gotouge Koyoharu","Truyện tranh");
    FictionBook fictionBook5 = new FictionBook("Doraemon","05",30000.0,"Fujiko","Truyện tranh");

    public void displayBook(){
        System.out.println("ProgrammingBook:");
        System.out.println(programmingBook1 + "\n" +
                programmingBook2 + "\n" +
                programmingBook3 + "\n" +
                programmingBook4 + "\n" +
                programmingBook5 + "\n");

        System.out.println("FictionBook:");
        System.out.println(fictionBook1 + "\n" +
                fictionBook2 + "\n" +
                fictionBook3 + "\n" +
                fictionBook4 + "\n" +
                fictionBook5 + "\n");
    }
    public void display(){
        System.out.printf("%-35s%-10s%-20s%-15s\n","Name","bookCode","price","author");
    }
    public ProgrammingBook findByNamePb(){
        ProgrammingBook foundName = null;
        nameFind = scanner.nextLine();
        for (ProgrammingBook programmingBook : programmingBooks){
            if (programmingBook.getName().contentEquals(nameFind)){
                foundName = programmingBook;
            }
        }
        return foundName;
    }
    public boolean isFindBookPb(ProgrammingBook programmingBook){
        boolean findOut = false;
        if (programmingBook != null){
            findOut = true;
        }
        return findOut;
    }
    public void displayAfterFindPb(ProgrammingBook programmingBook){
        if (isFindBookPb(programmingBook)){
            System.out.println("Sách: ");
            display();
            programmingBook.display();
        } else {
            System.out.println("Không có");
        }
    }
    public FictionBook findByNameFb(){
        FictionBook foundName = null;
        nameFind = scanner.nextLine();
        for (FictionBook fictionBook : fictionBooks){
            if (fictionBook.getName().contentEquals(nameFind)){
                foundName = fictionBook;
            }
        }
        return foundName;
    }
    public boolean isFindBookFb(FictionBook fictionBook){
        boolean findOut = false;
        if (fictionBook != null){
            findOut = true;
        }
        return findOut;
    }
    public void displayAfterFindFb(FictionBook fictionBook){
        if (isFindBookFb(fictionBook)){
            System.out.println("Sách: ");
            display();
            fictionBook.display();
        } else {
            System.out.println("Không có");
        }
    }
}
