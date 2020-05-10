import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Control control = new Control();
        Scanner scanner = new Scanner(System.in);
        control.inputBook();
        int choise;
        do {
            choise = getChoise(scanner);
            if (choise != 0 ){
                switch (choise){
                    case 1:
                        System.out.println("Danh sách sách");
                        control.displayBook();
                        break;
                    case 2:
                        System.out.print("Tìm sách programmingBook bằng tên: ");
                        ProgrammingBook foundBookPb = control.findByNamePb();
                        control.displayAfterFindPb(foundBookPb);
                        break;
                    case 3:
                        System.out.print("Tìm sách fictionBook bằng tên: ");
                        FictionBook foundBookFb = control.findByNameFb();
                        control.displayAfterFindFb(foundBookFb);
                }
            }else {
                System.out.println("Exit");
            }
        } while (choise != 0);
    }
    private static int getChoise(Scanner scanner){
        int choise;
        System.out.println("Nhập số để thao tác: \n"
                + "1. Xem danh sách\n" +
                "2. Tìm sách programmingBook bằng tên \n" +
                "3. Tìm sách fictionBook bằng tên \n" +
                "0. Exit");
        System.out.print("Nhập: ");
        choise = scanner.nextInt();
        return choise;
    }
}
