public class Task5 {
    static int Fib(int n){
        if (n <= 1) {
            return n;
        } else {
            return Fib(n - 1) + Fib(n - 2);
        }

    }
}
