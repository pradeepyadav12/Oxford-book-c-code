import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0, b=1;

        System.out.print(a +" ");

        if(n > 1){
            for(int i=2; i<=n; i++){
                System.out.print(b + " ");

                int Temp = b;
                b = a + b;
                a = Temp;
            }
            System.out.println();
        }
    }
}
