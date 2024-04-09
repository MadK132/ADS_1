public class Task6 {
    static int Pow(int a, int n){
        if(n==0){
            return 1;
        }
        return a*Pow(a,n-1);
    }
}
/**We need result number where a is in the power of n
 * So to make this by recursion, we multiply a until it will return 1
 *
 *
 */
