import java.util.Scanner;

public class NumberTillUserWants {
    public static void main(String args[]){
        int positive = 0, negative = 0, zeros = 0;
        System.out.println("Press 1 to continue or 0 to stop");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while(input == 1){
            System.out.println("Enter the number : ");
            int number = sc.nextInt();
            if(number > 0){
                positive++;
            }
            else if(number < 0){
                negative++;
            }
            else{
                zeros++;
            }

            System.out.println("Press 1 to comtinue or 0 to stop");
            input = sc.nextInt();
        }
        System.out.println("Positive : "+ positive);
        System.out.println("Negative : "+ negative);
        System.out.println("Zeros : "+ zeros);
    }
}
