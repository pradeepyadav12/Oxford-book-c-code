public class InvertedConstant {
    public static void main(String[] args){
        char n='E';
        for(char i='A'; i<='E'; i++){
            for(char j='E'; j>='A'; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
