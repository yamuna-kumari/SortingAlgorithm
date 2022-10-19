public class BubbleSort {
    private int arr[];

    public BubbleSort(int arr[]) {
        this.arr = arr;

    }

    public int[] sort() {
        for (int i = 0; i < arr.length; i++) {
            for(int j=0; j<arr.length-1; j++)
            if (arr[j] > arr[j + 1]) {
                int temp= arr[j];
                arr[j]= arr[j+1];
                arr[j+1]= temp;

            }
        }

        return arr;
    }

}
