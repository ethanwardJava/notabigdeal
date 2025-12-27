package JCF;

import java.util.*;

public class CollectionClass {
    static List<Integer> evenNumbers = new ArrayList<>();
    static List<Integer> oddNumbers = new ArrayList<>();
    static List<Integer> numbers = new ArrayList<>(List.of(2, 3, 0, 45, 6, 78, 9, 12, 11));
    static List<?> any = new ArrayList<>(List.of("Bob", 12, true, 12.2F, new Animal("Dog").toString()));

    public static void operate() {
        for (int i : numbers) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
                numbers.remove(i);
            } else {
                oddNumbers.add(i);
            }
        }
        Collections.sort(evenNumbers);
        Collections.sort(oddNumbers);
        System.out.println("Even numbers : " + evenNumbers);
        System.out.println("Odd numbers : " + oddNumbers);

        System.out.println("================================================================");

        for (Object o : any) {
            System.out.println(o);
        }

        Animal mouse = new Animal("Emi");
        Box<Wrom> worm;

    }

    static void main() {
        operate();
    }
}
