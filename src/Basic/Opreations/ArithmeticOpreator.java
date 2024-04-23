
package Basic.Opreations;


public class ArithmeticOpreator {
    public static void main(String[] args) {
int num1 = 10;
int num2 = 5;
        System.out.println("Addition"+(num1+num2));
        
        int num3 = num1 - num2;
        System.out.println("Substaction"+num3);
        
        int num4 = num2 - num1;
        System.out.println("Sub"+ num4);
        
        System.out.println("Multiplication: "+ (num1 * num2));
        
        System.out.println("Division: "+ (num1/num2));
        System.out.println("Remainder: "+ (num1%num2));
        String st1 ="1";
        String st2 = "4";
        System.out.println("String + String: "+ st1 + st2);
        
        int z = 2;
        int y = 3;
        System.out.println("Prefixed: "+z);
        System.out.println(++z);
        System.out.println(z);
        System.out.println("PostFixed: "+y);
        System.out.println(y++);
        System.out.println(y);
        
    }
}
