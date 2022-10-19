import java.util.Arrays;

public class SortingAlgorithm {
    private final int[] arr;
    int count = 0;

    public SortingAlgorithm(int[] arr) {
        this.arr = arr;
    }

    public void bubbleSort() {
        int pass = 0;
        System.out.println("Original Array : " + Arrays.toString((arr)));
        System.out.println();

        //Iterate a loop by array item size
        for (int index = 0; index < arr.length; index++) {
            //iterate over the array for pair of item
            pass++;
            for (int i = 0; i < arr.length - 1; i++)
                //compare each pair and swap if condition true
                if (arr[i] > arr[i + 1]) {
                    //swapping element in array
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            count++;
            System.out.println(pass + " pass result : " + Arrays.toString((arr)));
        }
        System.out.println("\n" + "Sorted Array : " + count + " times  :  " + Arrays.toString((arr)));
    }

    public void insertionSort(){
       /* i ← 1
        while i < length(A)
        j ← i
        while j > 0 and A[j-1] > A[j]
        swap A[j] and A[j-1]
        j ← j - 1
        end while
        i ← i + 1
        end while*/

        // iterate

        for(int i= 1; i<arr.length; i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j]= arr[j-1];
                arr[j-1]= temp;
                j= j-1;

            }
        }

        System.out.println("\n" + "Sorted Array :  " + Arrays.toString((arr)));
    }

}
