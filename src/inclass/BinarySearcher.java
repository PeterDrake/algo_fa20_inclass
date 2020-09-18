package inclass;

import edu.princeton.cs.algs4.StdOut;

public class BinarySearcher<K extends Comparable<K>> {

    public static void main(String[] args) {
        BinarySearcher<String> s = new BinarySearcher<>();
        String[] data = {"baklava", "burrito", "food", "millions", "nap", "sleep", "stocks"};
        StdOut.println(s.indexOf(data, "sleep"));
    }

    private int indexOf(K[] a, K key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            int comparison = key.compareTo(a[mid]);
            if      (comparison < 0) hi = mid - 1;
            else if (comparison > 0) lo = mid + 1;
            else return mid;
        }
        return -1;
    }


}
