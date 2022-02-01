
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int biggest = 0;
        
        if (number1 > number2) {
            biggest = number1;
        }else {
            biggest = number2;
        }
        
        if (number3 > biggest) {
            biggest = number3;
        }
        
        return biggest;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
