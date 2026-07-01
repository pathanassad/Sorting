import java.util.Arrays;

public class Main {

public static void main(String[] args){

    System.out.println("****************************");
    System.out.println("Selection Sort");
    int[] arr = {13, 46, 24, 52, 20, 9};
    SelectionSort r1 = new SelectionSort();
    int[] result1 = r1.sort(arr);
    System.out.println(Arrays.toString(result1));

    System.out.println("****************************");
    System.out.println("Bubble Sort");
    Bubble r2 = new Bubble();
    int[] result2 = r2.sort(arr);
    System.out.println(Arrays.toString(result2));

    System.out.println("****************************");
    System.out.println("Insertion Sort");
    Insertion r3 = new Insertion();
    int[] result3 = r3.sort(arr);
    System.out.println(Arrays.toString(result3));

}
}