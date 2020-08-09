import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();
            list.add("foo");
            list.add("buzz");
            list.add("bar");
            list.add("fork");
            list.add("bort");
            list.add("spoon");
            list.add("!");
            list.add("dude");

            List list1  = removeEvenLength(list);
            for (Object lst : list1) {
                System.out.println(lst);
            }

        }

        public static ArrayList<String> removeEvenLength(ArrayList<String> set) {
            ArrayList<String> list = new ArrayList<>();
            Iterator<String> itr = set.iterator();
            while (itr.hasNext()) {
                String element = itr.next();
                if (element.length() % 2 == 0) {
                    list.add(element);
                }
            }
            return list;
        }

    }
