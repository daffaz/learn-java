
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println(MainProgram.smallest(array));
    }
    
    public static int smallest(int[] array) {
        if (checkEligible(array)) {
            int smallest = array[0];
            
            for (int i : array) {
                if (i < smallest) {
                    smallest = i;
                }
            }
            
            return smallest;
        }
        
        return -1;
    }
    
    public static int indexOfSmallest(int[] array) {
        if (checkEligible(array)) {
            int smallestIndex = 0;
            
            for (int i = 0; i < array.length; i++) {
                if (array[i] < array[smallestIndex]) {
                    smallestIndex = i;
                }
            }
            
            return smallestIndex;
        }
        
        return -1;
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        if (checkEligible(array)) {
            int smallestIndex = startIndex;
            
            for (int i = startIndex; i < array.length; i++) {
                if (array[i] < array[smallestIndex]) {
                    smallestIndex = i;
                }
            }
            
            return smallestIndex;
        }
        
        return -1;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        try {
            
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
            
        } catch (Exception e) {
            
            System.out.println("Error" + e.getMessage());
            
        }
    }
    
    public static void sort(int[] array) {
        // outer loop, iterate all the array content till the end of array
        for (int i = 0; i < array.length; i++) {
            // inner loop, here we also iterate from j to the end of array
            // because if the 1st iterate successfully swap smallest value
            // with the first index, we can make sure that the most left 
            // (e.g index 0 at 1st iterate) is always the smallest and we don't 
            // need to check if there is a possible value smallest than the left side
            
            // first declare and initialize the smallest value as array[i]
            int smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                // if we found a number smaller than the current smallest
                // then we swap the smallest with the current index
                if (array[j] < array[smallest]) {
                    smallest = j;
                }
            }
            // after we iterate till the end, we swap the smallest with the most
            // left side, in this case is i variable
            MainProgram.swap(array, i, smallest);
        }
    }
    
    private static boolean checkEligible(int[] array) {
        return array.length > 0;
    }

}
