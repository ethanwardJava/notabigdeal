package JCF;

import java.util.*;

public class TheCollection {
    public static void operation() {
        Collection<Object> list = new ArrayList<>();
        list.add("Alex");
        list.add(17);
        list.add(true);
        Iterator<Object> it = list.iterator();
        it.forEachRemaining(System.out::println);

        HashSet<String> ifYouOrdered = new HashSet<>();
        ifYouOrdered.add("One");
        ifYouOrdered.add("Two");
        ifYouOrdered.add("Three");
        System.out.println(ifYouOrdered);

        System.out.println("=================================================================================");
        List<Integer> numbers = new ArrayList<>(List.of(2, 3, 6, 5, 9));
        Iterator<Integer> in = numbers.iterator();
        //in.forEachRemaining(System.out::println);
        while (in.hasNext()) {
            System.out.println("next : " + in.next());
        }
        System.out.println("=================================================================================");
        List<Integer> numbers2 = Arrays.asList(2, 3, 6, 5, 9);
        ListIterator<Integer> a = numbers2.listIterator(numbers2.size());
        while (a.hasPrevious()) {
            System.out.println("prev : " + a.previous());
        }
        System.out.println("=================================================================================");
        List<Integer> original = new ArrayList<>(List.of(1, 32, 54, 4, 23, 1));
        System.out.println("ORIGINAL : " + original);
        List<Integer> copy = List.copyOf(original);
        System.out.println("COPY : " + copy);
        System.out.println("=================================================================================");

    }

    static void main() {
        operation();
    }
}
