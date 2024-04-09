public class Task1 {
    static int findMinimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
/**Here is nothing complex, just by comparing each element of array we save a minimum and just return it
 * First element will be a minimum, we can also give a minimum the highest value, but it's complex
 *
 *
 */