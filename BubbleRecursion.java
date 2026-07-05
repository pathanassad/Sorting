public class BubbleRecursion {
public static void bubbleSort(int[] arr, int i, int j){
    if(i==0)
        return;
    if(j<i) {
        if (arr[j] > arr[j + 1]) {
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
        }
        bubbleSort(arr, i, j+1);

    }

        else {
            bubbleSort(arr, i-1, 0);
            }
        }
    }


