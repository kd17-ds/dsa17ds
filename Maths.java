import java.util.ArrayList;

public class Maths {

    public static int gcf(int a, int b) {
        System.out.println();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                arr.add(i);
            }
        }
        for (int val : arr) {
            System.out.print(val);
        }
        for (int i = arr.size() - 1; i >= 0; i--) {

            if (b % arr.get(i) == 0) {
                System.out.println();
                return arr.get(i);
            }
        }
        System.out.println();
        return 1;
    }

    public static int GCF(int a, int b) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                arr.add(i);
            }
        }
        for (int i = 2; i <= b; i++) {
            if (b % i == 0) {
                arr2.add(i);
            }
        }

        for (int val : arr) {
            System.out.print(val);
        }
        System.out.println();
        for (int val : arr2) {
            System.out.print(val);
        }

        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr2.contains(arr.get(i))) {
                System.out.println();
                return arr.get(i);
            }
        }
        System.out.println();
        return 1;
    }

    public static void main(String args[]) {
        // int n = 12321;
        // int digits = (int) Math.log10(n) + 1;
        // System.out.println(digits);
        // int rev = 0;
        // for (int i = n; i > 0; i = i / 10) {
        // int mod = i % 10;
        // rev = rev * 10 + mod;
        // }
        // System.out.println(rev);
        // if (rev == n) {
        // System.out.println("Hehe palindrome");
        // }

        // gcf
        System.out.println(GCF(14, 81));
        System.out.println(gcf(14, 28));
        int b = 50;
        int a = 30;
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        System.out.println(a);
    }
}