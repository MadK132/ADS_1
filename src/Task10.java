public class Task10 {
    static int GCD(int a, int b){
        if (b==0){
            return a;
        }
        return GCD(b,a%b);
    }
}
/**By Eucledian Algorithm we work with remainder of number
 * In case b==0 it will return a
 *
 *
 */
