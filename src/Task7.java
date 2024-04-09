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
