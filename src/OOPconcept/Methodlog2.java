
package OOPconcept;


public class Methodlog2 {
    public static void main(String[] args) {
        name("Teen Hug");//""
        myself("TeenHug",19);
        String name = "Teen Hug";
        int age = 20;
        myself(name, age);
    }
    
    public static void name(String name){
        System.out.println("Hello: " + name);
    }
    public static void myself(String name, int age){
        System.out.println("Name"+ name);
        System.out.println("Age"+ age);
    }
}
