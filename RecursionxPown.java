public class RecursionxPown {
    public static int printPower(int x, int n){
        if(n == 0){
            return 1;
        }

        if(x == 0){
            return 0;
        }
        int x1 = printPower(x, n-1);
        int xn = x * x1;
        return xn;
    }
    public static void main(String args[]){
        int x=0, n=5;
        int ans=printPower(x, n);
        System.out.println(ans);
    }
}
