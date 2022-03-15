
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int space = size - 1;
        for (int i = 1; i <= size; i++) {
            printSpaces(space);
            printStars(i);
            space -= 1;
        }
    }

    public static void christmasTree(int height) {
        int spaces = height - 1;
        int stars = 1;
        
        for (int i = 1; i <= height; i++) {
            printSpaces(spaces);
            printStars(stars);
            
            stars += 2;
            spaces -= 1;
        }
        
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
