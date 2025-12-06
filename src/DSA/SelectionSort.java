package DSA;

public class SelectionSort {
    private final int[] arr = {17, 5, 612, 10, 2, 3, 4, 11, 33};
    private final int size = arr.length;

    public void sort() {

        System.out.println("Before : ");
        for (int t : arr){
            System.out.print(t + "  ");
        }

        for (int i = 0; i < size - 1; i++) {
            int minValueIndex = i;

            // Compare ONLY the remaining unsorted part
            for (int j = i + 1; j < size; j++) {
                if (arr[minValueIndex] > arr[j]) {
                    minValueIndex = j;
                }
            }

            // Swap the found minimum with current i
            int temp = arr[i];
            arr[i] = arr[minValueIndex];
            arr[minValueIndex] = temp;
        }

        System.out.println("\nAfter : ");
        for (int t : arr){
            System.out.print(t + "  ");
        }
    }

    public static void main(String[] args) {
        SelectionSort b = new SelectionSort();
        b.sort();
    }
}
