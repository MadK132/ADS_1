public class Task2 {
    static float findaverage(int[] arr){
        float sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum/arr.length;
    }
}
/**We summarize elements in the array and just divide it by it length and get average
 *
 *
 *
 */
