import java.util.Arrays;

public class Main {

public static void main(String[] args){

    int[] arr = {13, 46, 24, 52, 20, 9};
    SelectionSort sort = new SelectionSort();
    int[] result = sort.sort(arr);
    System.out.println(Arrays.toString(result));
}
}