import java.util.ArrayList;
import java.util.HashSet;

public class JCF {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (int x : list) {
            System.out.println(x);
        }

        list.remove(1);

        for (int x = 0; x < list.size(); x++) {
            System.out.println(list.get(x));
        }

        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(2);
        System.out.println(set);
    }
}
