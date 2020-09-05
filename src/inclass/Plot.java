package inclass;

import edu.princeton.cs.algs4.StdDraw;

public class Plot {

    static final int MAX_X = 41;

    static int[] generateX() {
        int[] x = new int[MAX_X + 1];
        for (int i = 0; i < x.length; i++) {
            x[i] = i;
        }
        return x;
    }

    static int[]generateYForNSquared() {
        int[] y = new int[MAX_X + 1];
        for (int i = 0; i < y.length; i++) {
            y[i] = i * i;
        }
        return y;
    }

    static int[]generateYForN() {
        int[] y = new int[MAX_X + 1];
        for (int i = 0; i < y.length; i++) {
            y[i] = i;
        }
        return y;
    }
    static void plot(int[] x, int[] y) {
        for (int i = 0; i < x.length - 1; i++) {
            StdDraw.line(x[i], y[i], x[i+1], y[i+1]);
        }
    }

    static int[]generateYForBruteForceFibo() {
        int[] y = new int[MAX_X + 1];
        for (int i = 0; i < y.length; i++) {
            long before = System.nanoTime();
            Fibo.iterativeFibo(i);
            long after = System.nanoTime();
            y[i] = (int)(after - before);
        }
        return y;
    }

    static int[]generateYForRecursiveFibo() {
        int[] y = new int[MAX_X + 1];
        for (int i = 0; i < y.length; i++) {
            long before = System.nanoTime();
            Fibo.recursiveFibo(i);
            long after = System.nanoTime();
            y[i] = (int)(after - before);
        }
        return y;
    }

    static int[]generateYForClosedFormFibo() {
        int[] y = new int[MAX_X + 1];
        for (int i = 0; i < y.length; i++) {
            long before = System.nanoTime();
            Fibo.closedFormFibo(i);
            long after = System.nanoTime();
            y[i] = (int)(after - before);
        }
        return y;
    }

    public static void main(String[] args) {
        int[] x = generateX();
        int[] y = generateYForRecursiveFibo();
        int largestY = y[1];
        for (int i = 1; i < y.length; i++) {
            largestY = Math.max(largestY, y[i]);
        }
        StdDraw.setXscale(0, MAX_X);
        StdDraw.setYscale(0, 1000);
        plot(x, y);
        StdDraw.setPenColor(StdDraw.BLUE);
        y = generateYForBruteForceFibo();
        plot(x, y);
        StdDraw.setPenColor(StdDraw.ORANGE);
        y = generateYForClosedFormFibo();
        plot(x, y);
    }

}
