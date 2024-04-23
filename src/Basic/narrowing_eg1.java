
package Basic;

public class narrowing_eg1 {
    public static void main(String[] args) {
        double double1;
        double1 = 48.91d;
        
        //int num1 = double1;
        int num1 = (int) double1;
        System.out.println(num1);
        
    }
}
