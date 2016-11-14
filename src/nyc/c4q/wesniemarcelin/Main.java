package nyc.c4q.wesniemarcelin;

public class Main {

    public static void main(String[] args) {
        int[] myArray = {5, 10, 12, 22, 38, 50, 75};
        binarySearch(myArray, 75);
    }
    /*
 * Returns either the index of the location in the array,
 * or -1 if the array did not contain the targetValue
 */
    public static int binarySearch(int[] array, int target) {
        int max = array.length - 1;
        int min = 0;
        for (int i = 0; i < max; i++) {
            if (max < min) {
                return -1;
            } else {
                int guess = (max + min) / 2;
                if (array[guess] == target) {
                    return guess;
                } else if (array[guess] < target) {
                    min = guess + 1;
                } else {
                    max = guess - 1;
                }
            }
        }
        return -1;
    };
}
