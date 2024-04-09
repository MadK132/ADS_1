public class Task9 {
    static int BinCoef(int k, int n){
        if(k==0 || k==n){
            return 1;
        }
        return BinCoef(k-1,n-1)+BinCoef(k,n-1);
    }
}
/**Simple task by the formula you gave us, just by conditions in the task info we get solution
 *
 *
 *
 */
