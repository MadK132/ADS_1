public class Task5 {
    static int Fib(int n){
        int prev = 0;
        int next = 1;
        int d = 0;
        for(int i=2;i<n;i++){
            d = prev;
            prev = next;
            next +=d;
        }
        return next;
    }
}
