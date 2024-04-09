public class Task4 {
    static int Factorial(int n){
        if(n==0){
            return 1;
        }
        return n*Factorial(n-1);
    }
}
/**We take exception as n==0, because when it's 0, factorial of this will be equal to 1
 *After this we write recursion in which it will multiply until the end (from n to 1)
 *
 *
 */