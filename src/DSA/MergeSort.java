package DSA;

public class MergeSort {

    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            //Divide the whole array into chucks recursively
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid); //Left to mid
            mergeSort(arr, mid + 1, right); // mid to Right

            mergeThemBack(arr, left, mid, right);

        }
    }

    private static void mergeThemBack(int[] arr, int left, int mid, int right) {

        int lSize = mid - left + 1;
        int rSize = right - mid;

        int[] leftSideArray = new int[lSize];
        int[] rightSideArray = new int[rSize];

        for (int a = 0; a < lSize; a++) {
            leftSideArray[a] = arr[left + a];
        }
        for (int a = 0; a < rSize; a++) {
            rightSideArray[a] = arr[mid + 1 + a];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < lSize && j < rSize) {
            if (leftSideArray[i] <= rightSideArray[j]) {
                arr[k] = leftSideArray[i];
                i++;
            } else {
                arr[k] = rightSideArray[j];
                j++;
            }
            k++;
        }

        while (i < lSize) {
            arr[k] = leftSideArray[i];
            i++;
            k++;
        }

        while (j < rSize) {
            arr[k] = rightSideArray[j];
            j++;
            k++;
        }

    }


    public static void operation() {

        int[] arr = {2, 6, 8, 5, 7, 16, 22, 1, 3, 4, 9};
        System.out.println("Before Sorting : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }


        mergeSort(arr, 0, arr.length - 1);


        System.out.println();
        System.out.println("After Sorting : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }


    static void main() {
        operation();
    }
}
