package JCF;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.SequencedCollection;

public class ListPractice {

    static ArrayList<Integer> numbers =
            new ArrayList<>(List.of(2, 3, 6, 5, 48, 1, 0, -56, -5));

    static void main() {
        System.out.println("Actual : " + numbers);
        ListIterator<Integer> reversedByIterator = numbers.listIterator(numbers.size());
        System.out.print("reversed: " );
        while (reversedByIterator.hasPrevious()) {
            System.out.print(reversedByIterator.previous() + " ");
        }
        System.out.println();
        SequencedCollection<Integer> reverse = numbers.reversed();
        System.out.println("reversed: " + reverse);
        System.out.println("reversed: " + numbers.reversed());

        ArrayList<Integer> cloned = (ArrayList<Integer>) numbers.clone();
        System.out.println("Cloned : " + cloned);
    }
}
