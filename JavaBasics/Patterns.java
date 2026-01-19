import java.util.*;

public class Patterns {
   public static void main(String[] args) {
      // int n = 9;

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

      // for (int i = 0; i <= 5; i++) {
      // for (int j = 0; j <= i; j++) {
      // int k = (i + j) % 2;

      // System.out.print(k == 0 ? 1 : 0);
      // }
      // System.out.println();
      // }

      // for (int i = 1; i <= 4; i++) {
      // for (int j = 1; j <= 4; j++) {
      // System.out.print(j <= i ? j : " ");
      // }
      // for (int j = 4; j >= 1; j--) {
      // System.out.print(j <= i ? j : " ");
      // }
      // System.out.println();
      // }

      // int n = 1;
      // for (int i = 1; i <= 5; i++) {
      // for (int j = 1; j <= i; j++) {
      // System.out.print(n);
      // n++;
      // }
      // System.out.println();
      // }

      // char s= 'A';
      // for (char i = 'A'; i <= 'E'; i++) {
      // for (char j = i; j <= 'E'; j++) {
      // System.out.print(s);
      // s++;
      // }
      // System.out.println();
      // s='A';
      // }

      // for (char a = 'A'; a <= 'E'; a++) {
      // for (char b = 'A'; b <= a; b++) {
      // System.out.print(a);
      // }
      // System.out.println();
      // }

      // for (int i = 1; i <= 4; i++) {
      // int aVar = (2 * i) - 1;
      // for (int j = 4; j > i; j--) {
      // System.out.print(" ");
      // }
      // char c = 'A';
      // for (int k = 1; k <= aVar; k++) {
      // int haha = aVar / 2;
      // System.out.print(haha >= k ? c++ : c--);
      // }
      // System.out.println();
      // }

      // char a = 'E';
      // for (int i = 1; i <= 5; i++) {
      // char b = a;
      // for (int j = 1; j <= i; j++) {

      // System.out.print(b);
      // b++;
      // }
      // System.out.println();
      // a--;
      // }

      // for (int i = 0; i < 5; i++) {
      // for (int j = 5; j > i; j--) {
      // System.out.print("*");
      // }
      // for (int j = 1; j <= 2 * i; j++) {
      // System.out.print(" ");
      // }
      // for (int j = 5; j > i; j--) {
      // System.out.print("*");
      // }
      // System.out.println();
      // }

      // for (int i = 5; i > 0; i--) {
      // for (int j = 5; j >= i; j--) {
      // System.out.print("*");
      // }
      // for (int j = 1; j < 2 * i - 1; j++) {
      // System.out.print(" ");
      // }
      // for (int j = 5; j >= i; j--) {
      // System.out.print("*");
      // }
      // System.out.println();
      // }

      // for (int i = 0; i < 5; i++) {
      // for (int j = 5; j > i; j--) {
      // System.out.print("*");
      // }
      // for (int j = 1; j <= 2 * i; j++) {
      // System.out.print(" ");
      // }
      // for (int j = 5; j > i; j--) {
      // System.out.print("*");
      // }
      // System.out.println();
      // }

      // for (int i = 1; i <= 5; i++) {
      // for (int j = 1; j <= 5; j++) {
      // if (i == 1 || j == 1 || i == 5 || j == 5) {
      // System.out.print("*");
      // }else{
      // System.out.print(" ");
      // }

      // }
      // System.out.println();
      // }

      int n = 9;
      int x = n % 2 == 0 ? n / 2 : n / 2 + 1;
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            int bottom = n - i - 1;
            int right = n - j - 1;
            System.out.print(x - (Math.min(Math.min(i, j), Math.min(bottom, right))));
         }
         System.out.println();
      }

   }
}
