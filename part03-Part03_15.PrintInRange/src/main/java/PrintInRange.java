
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
    }
    
    public static void printNumbersInRange(ArrayList<Integer> list, int start, int end) {
        for (int num : list) {
            if (num >= start && num <= end) {
                System.out.println(num);
            }
        }
    }
}
