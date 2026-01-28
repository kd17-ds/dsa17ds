import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Recursion {

    public static void printName(int count, int a, String name) {
        if (count <= a) {
            System.out.println(name + ' ' + count);
            count++;
            printName(count, a, name);
        } else {
            System.out.println(1);
        }
    }

    public static void printN(int count, int a) {
        if (count <= a) {
            System.out.println(count);
            count++;
            printN(count, a);
        } else {
            return;
        }
    }

    public static void revPrint(int count, int a) {
        if (count >= 0) {
            System.out.println(count);
            count--;
            revPrint(count, a);
        }
    }

    public static int printNBt(int count, int a) {
        if (count == a) {
            return count;
        }
        count++;
        System.out.println(printNBt(count, a));

        return count - 1;
    }

    public static int sumN(int n, int count, int sum) {

        // if (count <= n) {
        // sum += count;
        // count++;
        // return sumN(n, count, sum);
        // }
        // for (int i = 1; i <= n; i++) {
        // sum += i;
        // }

        sum = n * (n + 1) / 2;
        return sum;
    }

    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void revArr(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < (n / 2); i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    // static class Solution {
    // public void revArr2(ArrayList<Integer> arr) {
    // Collections.reverse(arr);
    // }

    // }

    public static void fibonachhiSeries(int n) {
        int a = 0;
        int b = 1;
        int x = 0;
        while (x <= n) {
            x = a + b;
            a = b;
            b = x;
            System.out.print(x + " ");
        }
    }

    public static void printFib(int a, int b, int n) {
        if (n == 0)
            return;

        int c = a + b;
        System.out.print(c + " ");
        printFib(b, c, n - 1);
    }

    public static void main(String args[]) {
        // int arr[] = { 1, 2, 3, 4, 5 };
        // ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        // Solution obj = new Solution();

        // obj.revArr2(arr1);
        // for(int x : arr1){
        // System.out.println(x);
        // }
        System.out.print(0 + " " + 1 + " ");
        fibonachhiSeries(5);
    }
}
