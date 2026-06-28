public class SelectionSort {

public int[] sort(int[] arr) {

    for(int i = 0; i<=arr.length-2; i++) {
        int minimum = i;
        for (int j = i+1; j<=arr.length-1; j++) {
            if(arr[j]<arr[minimum]) {
                minimum = j;
            }
        }
        int temp = arr[minimum];
        arr[minimum] = arr[i];
        arr[i] = temp;

    }

    return arr;

}
}