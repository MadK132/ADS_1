public class Task8 {
    static boolean check(String s) {
        return  Dig(s,0);
    }
    static boolean Dig(String s, int i){
        if(s.length()==i){
            return true;
        }
        if(s.charAt(i)>='0' & s.charAt(i)<='9') {
            return Dig(s,i+1 );
        }
        else{
            return false;
        }
    }
}
/**We need to functions here to not write a huge code.
 * To check whether string consist of only digit or not, we must check each of its element
 * So we call function in the function (using recursion) to check first,second and other elements
 * After this if condition is not true, we return false and that's all
 *First if is necessary because at the end it will show us a problem and to fix it we need it
 *
 *
 */
