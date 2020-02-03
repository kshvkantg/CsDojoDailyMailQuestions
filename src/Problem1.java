//Google
//Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
//For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

import java.util.ArrayList;
import java.util.Scanner;

public class Problem1 {
    public static boolean checkK(ArrayList<Integer> al , int k){
        for(int i = 0 ; i < al.size();i++){
            if(al.contains(k - al.get(i))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        int size = scanner.nextInt();
        for(int i = 0 ; i < size ; i++){
            al.add(scanner.nextInt());
        }
        int k = scanner.nextInt();
        System.out.println(checkK(al,k));
    }
}
