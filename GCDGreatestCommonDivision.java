import java.util.Scanner;

public class GCDGreatestCommonDivision {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int gcd = 0, Temp;
        while(y != 0){
            Temp = y;
            y = x%y;
            x = Temp;
        }
        gcd = x;
        System.out.println("gcd : "+ gcd);
    }
}
