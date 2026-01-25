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

        if (count <= n) {
            sum += count;
            count++;
            return sumN(n, count, sum);
        }
        // for (int i = 1; i <= n; i++) {
        // sum += i;
        // }
        return sum;
    }

    public static void main(String args[]) {
        System.out.print(sumN(5, 1, 0));
    }
}
