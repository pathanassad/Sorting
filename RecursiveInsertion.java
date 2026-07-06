public class RecursiveInsertion {

    public void sort(int[] arr, int i, int j){
        if(i>arr.length-1)
            return;

        if(j>0) {
            if (arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }

            sort(arr, i,j-1);

        }
        else {
            sort(arr, i+1, i+1);
        }

    }
}
