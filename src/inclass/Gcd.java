package inclass;

public class Gcd {

    public static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
//        int i = m;
//        if (n < m) {
//            i = n;
//        }
//        for ( ; ; i--) {
//            if (m % i == 0 && n % i == 0) {
//                return i;
//            }
//        }
    }

}
