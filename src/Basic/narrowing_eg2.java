package Basic;

public class narrowing_eg2 {
    public static void main(String[] args) {
        int num1 ;
        num1 = 98;
        
        char char1 = (char)num1;
        System.out.println("Character " + char1);
        
        int num2 = 71;
        char char2 = (char) num2;
        System.out.println(char2);
    }
}
