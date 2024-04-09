public class Task6 {
    static int Pow(int a, int n){
        int res = a;
        for(int i = 1; i<n;i++){
            res *=a;
        }
        return res;
    }
}
