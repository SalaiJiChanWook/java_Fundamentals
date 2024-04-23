
package javabaasic;


public class Yards {
    public static void main(String[] args) {
        int length,width;
        double price;
        length = 25;
        width = 42;
        price = 10.5;
        int area = length * width;
        // 1 square yard = 9 square feet
        double yard = area/9.0;
        //1yard square = 10.5 price
        System.out.println("The cost of carputing the floor: "+ yard*10.5);
        //((length*width)/9.0)*10.5
    }
}
