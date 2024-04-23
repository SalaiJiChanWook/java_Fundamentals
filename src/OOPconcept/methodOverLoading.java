
package OOPconcept;


public class methodOverLoading {
    public static void main(String[] args) {
        System.out.println(addition(2, 3));
        System.out.println(addition(4.5, 3.14));
    }
    
    public static int addition(int x, int y){
        return x+y;
    }
    public static double addition(double x, double y){
        return x+y;
    }
}
