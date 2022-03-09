
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daffaz
 */
public class Main {
    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        
        for (Book book : books) {
            if (book.getId() == searchedId) {
                return book.getId();
            }
        }
        
        return -1;
    }
    
    public static int binarySearch(ArrayList<Book> books, int searchedId) {
        
        int low = 0;
        int high = books.size() - 1;
        
        while (low < high) {
            int middle = low + ((high - low) / 2);
            int currentId = books.get(middle).getId();
            
            if (currentId == searchedId) {
                return middle;
            }else if (currentId < searchedId) {
                low = middle + 1;
            }else {
                high = middle - 1;
            }
        }
        
        return -1;
    }
}
