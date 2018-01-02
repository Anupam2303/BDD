public class ArrProb {

    public static void main(String arg[]) {
        int arr[] = {1, 2, 3};
        ArrProb arrProb = new ArrProb();
        arrProb.ArrReturn(arr);
    }

    // Prints the array
    public void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    private void ArrReturn(int arr[]) {
        int arb[], mul;
        int n = arr.length;
        arb = new int[n];
        mul = 1;
        for (int i = 0; i < n; i++) {
            mul = mul * arr[i];
        }
        for (int i = 0; i < n; i++) {
            arb[i] = mul / arr[i];
        }
        printArray(arb);
    }
}
