package Collections;
import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        List data = new ArrayList();
        data.add(100);
        data.add(123);
        data.add(100);
        data.add("Rohit");
        data.add(12.99);
        data.add("Rohit");

        Iterator it = data.iterator();
        System.out.println("Displaying ALL elements from LIST");

        while (it.hasNext()) {

            System.out.println(it.next());
        }

        Set data2 = new HashSet();
        data2.addAll(data);

        System.out.println("Displaying ALL elements from SET");
        Iterator it2 = data2.iterator();

        while (it2.hasNext()) {

            System.out.println(it2.next());

            Integer t = 100;
            Integer s = 12;
            System.out.println(t.compareTo(s));


        }
    }
}

