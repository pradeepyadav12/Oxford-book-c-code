public class InvertedConstantTriangle {
    public static void main(String[] args){
        char n='E';
        for(char i='A'; i<='E'; i++){
            for(char j='A'; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
