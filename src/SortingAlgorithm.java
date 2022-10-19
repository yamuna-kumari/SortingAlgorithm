import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingAlgorithm {
    private int arr[];

    public SortingAlgorithm(int arr[]) {
        this.arr = arr;
    }

    public void bubbleSort() {
        //Iterate a loop by array item size
        for (int index = 0; index < arr.length; index++) {
            //iterate over the array for pair of item
            for (int element = 0; element < arr.length - 1; element++)
                //compare each pair and swap if condition true
                if (arr[element] > arr[element + 1]) {
                    //swapping element in array
                    int temp = arr[element];
                    arr[element] = arr[element + 1];
                    arr[element + 1] = temp;
                }
        }

        System.out.println("Sorted Array : " + Arrays.toString((arr)));
    }

}
