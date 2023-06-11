public class RecursionFibonacci {
    public static void calcFibonacci(int a, int b, int n){
        if(n == 0){
            return;
        }
        System.out.println(a);
        calcFibonacci(b, a+b, n-1);
    }
    public static void main(String args[]){
        calcFibonacci(0, 1, 7);
    }
}
