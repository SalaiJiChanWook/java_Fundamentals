
package Basic.Opreations;


public class MathFunction {
    public static void main(String[] args) {
        //Math => class
        //function or method
        
        //maxinum number => Math.max(x, y)
        int num1 = Math.max(12, 4);
        System.out.println("Maxinum Number: "+ num1);
        
        System.out.println("Maxi Number: " + Math.max(15, 1)+ "\n");
        
        //mininum number => Math.min(x,y);
        System.out.println("Mininum");
        int num2 = Math.min(12, 4);
        System.out.println("Mininum Number: " + num2);
        
        System.out.println("MiniNum number: "+ Math.min(15, 1));
        
        //power => Math.pow(x, y);
        System.out.println("Power" + Math.pow(2, 4) + "\n");
        
        //sqrt => Math.sqrt(x)
        System.out.println("Square Root");
        System.out.println("Square Root: "+ Math.sqrt(4));
        
        //random => Math.random()
        System.out.println("Random");
        System.out.println("Random Number: "+ Math.random());
        
        System.out.println("Random Number between 0 and 100: " + Math.random()*101);
        
        //Cceling function => Math.ceil(x):
        System.out.println("Celing Function : " + Math.ceil(1.2) + "\n");
        
        //Floor function => Math.floor(x);
        int num = (int) Math.floor(1.2);
        System.out.println("Floor Function: "+ num);
        
    }
}
