public class BubbleRecursion {
public void bubbleSort(int[] arr, i, j){
    if(i>=1)
        return;
    if(arr[j]> arr[j+1]){
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
        j++;


    }
    i--;
    return bubbleSort(arr, arr.length-1, 0);
}
}