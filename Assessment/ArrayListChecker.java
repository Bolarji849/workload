public class ArrayListChecker {
    public static void main(String[] args) {
        int input = 5; 
        int[] array = {1, 2, 3, 4, 5}; 
        boolean exists = listChecker(array, input);
        
        if (exists) {
            System.out.println(input + " exists in the array.");
        } else {
            System.out.println(input + " does not exist in the array.");
        }
    }

    public static boolean listChecker(int[] array, int input) {
        for (int count = 0; count < array.length; count++) {
            if (array[count] == input) {
                return true; 
            }
        }
        return false; 
    }
}