public class Task7 {
    static void reverse(int[] arr,int start,int n){

        int end = n-1;
        int temp = arr[start];
        if (start >= n) {
            return;
        }
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr,start+1,n-1);
    }
}
/**To make array reverse without array data structure, we pick it start and the end and just change order each time
 * for example we change the first element of array with the last
 *
 *
 *
 */
