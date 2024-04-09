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
