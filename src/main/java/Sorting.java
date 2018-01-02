public class Sorting {

    // Driver code to test above
    public static void main(String args[]) {
        Sorting ob = new Sorting();
        int ars[] = {64, 25, 12, 22, 11};
        int arb[] = {64, 25, 12, 22, 11};
        int ari[] = {7, 8, 5, 4, 3};
        ob.SelectionSort(ars);
        System.out.println("Selection Sorted array");
        ob.printArray(ars);
        ob.bubbleSort(arb);
        System.out.println("Bubble Sorted array");
        ob.printArray(arb);
        ob.insertSort(ari);
        System.out.println("Insertion Sorted array");
        ob.printArray(ari);
        // thuus done
    }

    void SelectionSort(int arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            printArray(arr);
        }
    }

    public void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    printArray(arr);
                }
    }

    // Insertion Sort
        /*Function to sort array using insertion sort*/
    public void insertSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                printArray(arr);
            }
            arr[j + 1] = key;
        }
    }

    // Prints the array
    public void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}


