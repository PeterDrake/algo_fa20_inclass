package inclass;

public class Fibo {

    public static int recursiveFibo(int n) {
        if (n < 2) {
            return n;
        }
        return recursiveFibo(n - 1) + recursiveFibo(n - 2);
    }

    public static int recursiveFibo2(int n) {
        if (n < 2) {
            return n;
        }
        return helper(0, 1, n - 1);
    }

    /**
     * a and b are the two previous numbers
     */
    public static int helper(int a, int b, int n) {
        if (n == 0) {
            return b;
        }
        return helper(b, a + b, n - 1);
    }

    public static int iterativeFibo(int n){
        int a,b, c;
        a = 0;
        b = 1;
        c = 0;
        if(n == 0){
            return 0;
        }
        else if(n  == 1){
            return 1;
        }
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static int closedFormFibo(int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        double psi = (1 - Math.sqrt(5)) / 2;
        return (int)Math.round((Math.pow(phi, n) - Math.pow(psi, n)) / Math.sqrt(5));
    }

    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        System.out.println(recursiveFibo2(20));
        long after = System.currentTimeMillis();
        System.out.println(after - before + " milliseconds");
    }
}
