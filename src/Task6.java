public class Task6 {
    static int Pow(int a, int n){
        if(n==0){
            return 1;
        }
        return a*Pow(a,n-1);
    }
}
