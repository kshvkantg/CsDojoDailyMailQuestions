//Uber
//   Given an array of integers, return a new array such that each element at index i of the new array is the product
//   of all the numbers in the original array except the one at i.
//   For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input
//   was [3, 2, 1], the expected output would be [2, 3, 6].
import java.util.Scanner;

public class Problem2 {
    private static int[] updatedArray(int[] arr){
        int mul = 1;
        for(int i = 0 ; i < arr.length;i++){
            mul = mul*arr[i];
        }
        int[] ans = new int[arr.length];

        for(int i = 0 ; i < ans.length;i++){
            ans[i] = mul/arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = scanner.nextInt();
        }
        int[] ans = updatedArray(arr);

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
