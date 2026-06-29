class Bubble {
public int[] sort(int[] arr){
    for (int i = arr.length - 1; i>=1; i--){
        boolean didSwap = false;
        for (int j = 0; j<=i-1; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                didSwap = true;
            }

            if(didSwap == false)
                break;
        }

    }
    return  arr;

}
}