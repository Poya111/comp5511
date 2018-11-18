import java.util.Arrays;
import java.util.Scanner;
class BinarySearch{

    void binarySearching(int ar[], int target){
        int min = 0;
        int max = ar.length;
        int pivot =min + ( max - min) / 2;
        do {
            if (target < ar[pivot]) {
                max = pivot;
            } else {
                min = pivot;
            }
            if (target ==  ar[pivot]){
                System.out.println("Result: arr[" + pivot + "]= " + ar[pivot]);
                break;
            }
            pivot = min +( max - min) / 2;
        }while (min <= max);
        if(target != ar[pivot])
            System.out.println("Result not found!");

    }
}
public class BSearch {
    public static void main(String [] args){
        Scanner sc = new Scanner( System.in);
        int arr [] = {1, 4, 13, 25, 30, 46, 88, 91, 99,112};
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter your number: ");
        int target = sc.nextInt();
        BinarySearch ob = new BinarySearch();
        ob.binarySearching(arr, target);
    }
}
