public class StringBuilderInsertCharacter {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("and");
        sb.insert(0, 'S'); // insert character from index
        System.out.println(sb);
        sb.delete(0, 1); // delete character from index
        System.out.println(sb);
    }
}
