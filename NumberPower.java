import java.util.Scanner;

public class NumberPower {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x : ");
        int x = sc.nextInt();
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int result = 1;
        for(int i=1; i<=n; i++){
            result = result * x;
        }
        System.out.println("x to the power n is : "+ result);
    }
}
