import java.util.Scanner;

public class Problem420 {

     public static int check(int num){
        int ans = num;
        int sum = 0;

        while (num >= 1){
            sum = sum + num%10;
            num = num/10;
        }

        if(sum == 10){
            ans = num;
        }
        else {
            ans = ans*10 + (10 - sum);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(check(num));
    }
}
