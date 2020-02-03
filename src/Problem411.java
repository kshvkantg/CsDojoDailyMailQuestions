import java.util.Scanner;
import java.util.Stack;

public class Problem411 {
    public static boolean check(String str,int k){

        int i = 0;
        Stack<Character> charStack = new Stack<>();
        for( i = 0 ; i < str.length()/2 ; i++){
            charStack.push(str.charAt(i));
        }

        while (i < str.length()){
            if(str.charAt(i) == charStack.peek()){
                charStack.pop();
                i++;
            }
            else if(str.charAt(i) != charStack.peek() && k > 0){
                str = str.substring(0,i - 1) + str.substring(i);
                k--;
            }
            else {

            }
        }
        return charStack.isEmpty();

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int n = scan.nextInt();
        System.out.println(check(str,n));
        System.out.println(str.substring(0,4)+str.substring(5));
    }
}
