import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookCollection = new ArrayList<>();
        
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            String pages = scanner.nextLine();
            System.out.print("Publication year: ");
            String pubYear = scanner.nextLine();
            
            bookCollection.add(new Book(title, pages, pubYear));
        }
        
        System.out.println("");
        System.out.print("What information will be printed? ");
        String input = scanner.nextLine();
        
        for (Book book : bookCollection) {
            if (input.equals("everything")) {
                System.out.println(book);
            }else if (input.equals("name")) {
                System.out.println(book.getTitle());
            }
        }
    }
}
