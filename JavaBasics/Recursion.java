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

    public static int printNBt(int count, int a) {
        if (count == a) {
            return count;
        }
        count++;
        System.out.println(printNBt(count, a));

        return count-1;
    }

    public static void main(String args[]) {
        printNBt(0, 10);
    }
}
