public class Task5 {
    static int Fib(int n){
        if (n <= 1) {
            return n;
        } else {
            return Fib(n - 1) + Fib(n - 2);
        }
    }
}
/**Fibonacci numbers sequence is combining the previous number to the next
 * We make exception, because this sequence cover only numbers from 1
 *
 *
 *
 */
