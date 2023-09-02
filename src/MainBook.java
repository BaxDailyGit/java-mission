import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainBook {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(Arrays.asList(
                new Book("클린코드(Clean Code)"),
                new Book("객체지향의 사실과 오해"),
                new Book("테스트 주도 개발(TDD)")
        ));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("========================");
            System.out.println("대여할 책의 번호를 입력하세요.");
            for (int i = 0; i < books.size(); i++) {
                Book book = books.get(i);
                if (book.isBorrowed() == true){
                    System.out.println((i + 1) + ". " + book.getName() + " - 대여 중");
                }
                else if (book.isBorrowed() == false){
                    System.out.println((i + 1) + ". " + book.getName() + " - 대여 가능");
                }
            }

            Book selectedBook = books.get(scanner.nextInt() - 1);

            if (selectedBook.isBorrowed()==true) {
                System.out.println("대여 중인 책은 대여할 수 없습니다.");
            } else if (selectedBook.isBorrowed()==false){
                selectedBook.setBorrowed(true);
                System.out.println("정상적으로 대여가 완료되었습니다.");
            }
        }
    }
}