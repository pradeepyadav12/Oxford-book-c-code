public class StringBuilderCharacterIndex {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Pradeep");
        System.out.println(sb.charAt(2)); // Get a character from index
        sb.setCharAt(0, 'r'); // set a character from index where you can set the character
        System.out.println(sb);
    }
}
