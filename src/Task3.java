public class Task3 {
    static boolean Prime(int n) {
        boolean t = true;
        if (n == 1) {
            return false;
        } else if (n > 1) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    t = false;
                    break;
                }
            }
        }
        return t;
    }
}
