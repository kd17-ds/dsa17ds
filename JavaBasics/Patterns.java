import java.util.*;

public class Patterns {
   public static void main(String[] args) {
      int n = 9;

      // for (int i = 0; i <= n / 2; i++) {
      // for (int k = n / 2; k > i; k--) {
      // System.out.print(" ");
      // }
      // for (int k = 0; k <= i; k++) {
      // System.out.print("*");
      // }
      // for (int k = 0; k < i; k++) {
      // System.out.print("*");
      // }
      // System.out.println();
      // }

      // for (int i = n / 2; i >= 0; i--) {
      // for (int k = n / 2; k > i; k--) {
      // System.out.print(" ");
      // }
      // for (int k = 0; k <= i; k++) {
      // System.out.print("*");
      // }
      // for (int k = 0; k < i; k++) {
      // System.out.print("*");
      // }
      // System.out.println();
      // }

      // for(int i = 0;i <= n/2; i++){
      // for (int j = 0; j<=i;j++){
      // System.out.print("*");
      // }
      // System.out.println();
      // }
      // for(int i = n/2;i >= 0; i--){
      // for (int j = 0; j<i;j++){
      // System.out.print("*");
      // }
      // System.out.println();
      // }

      for (int i = 0; i <= 5; i++) {
         for (int j = 0; j <= i; j++) {
            int k = (i + j) % 2;

            System.out.print(k == 0 ? 1 : 0);
         }
         System.out.println();
      }
   }
}
