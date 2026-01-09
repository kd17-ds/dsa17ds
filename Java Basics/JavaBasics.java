import java.util.*;

public class JavaBasics {
    public static void main(String[] args) {
        // int i = 1;
        // while (i <= 5) {
        // System.out.println(i);
        // i++;
        // }

        // for (int k = 1; k <= 5; k++) {
        // for (int j = k; j <= 5; j++) {
        // System.out.print('*');
        // }
        // System.out.println();
        // }

        // for (int k = 1; k <= 5; k++) {
        // for (int j = 1; j <= k; j++) {
        // System.out.print(k);
        // }
        // System.out.println();
        // }

        // int g = 1;
        // for (int k = 5; k >= 1; k--) {
        // for (int j = k; j >= 1; j--) {
        // System.out.print(g);
        // g++;
        // }
        // System.out.println();
        // g = 1;
        // }

        int n = 5;

        // for (int i = 1; i <= n; i++) {
        // for (int j = n - 1; j >= i; j--) {
        // System.out.print(" ");
        // }
        // for (int k = 1; k <= i; k++) {
        // System.out.print("*");
        // }
        // for (int l = 1; l < i; l++) {
        // System.out.print("*");
        // }
        // System.err.println();
        // }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = n - 1; k > i; k--) {
                System.out.print("*");
            }
            for (int l = n; l >= i; l--) {
                System.out.print("*");
            }
            System.err.println();
        }
    }
}