
package Basic;

public class inDex {
    public static void main(String[] args) {
        
        String st1 = "Hello, Hi";
        
         int num1 = st1.indexOf("H");
         
         System.out.println("First H: "+num1);
         
         System.out.println("Second H: " + st1.indexOf("H", num1+1));
         
                 }
}
