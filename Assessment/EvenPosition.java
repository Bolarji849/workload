import java.util.Arrays;

public class EvenPosition {

    public static int[] isEvenPosition(int[] number) {
       
        int outputSize = (number.length + 1) / 2; 
        int[] element = new int[outputSize];

        for (int index = 0, count = 0; index < number.length; index += 2, count++) {
            element[count] = number[index];
        }

        return element;
    }

    public static void main(String[] args) {
        int[] userInput = {1, 2, 5, 6, 3, 8, 7, 90, 10};
        System.out.print(Arrays.toString(isEvenPosition(userInput)));
    }
}