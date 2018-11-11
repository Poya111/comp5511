import java.util.Arrays;
import java.util.Scanner;

public class BSearch {
    public static void main(String [] args){
        Scanner sc = new Scanner( System.in);
        int arr [] = {1, 4, 13, 25, 30, 46, 88, 91, 99,112};
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter your number: ");
        int target = sc.nextInt();
        int min = 0;
        int max = arr.length;
        int pivot =min + ( max - min) / 2;
        do {
            if (target < arr[pivot]) {
                max = pivot;
            } else {
                min = pivot;
            }
            if (target ==  arr[pivot]){
                System.out.println("Result: arr[" + pivot + "]= " + arr[pivot]);
                break;
            }
            pivot = min +( max - min) / 2;
        }while (min <= max);
        if(target != arr[pivot])
            System.out.println("Result not found!");

    }
}
