
package OOPconcept;


public class constrictorEg2 {
    int x;
    public constrictorEg2(int num1) {
        x = num1;
    }
    public static void main(String[] args) {
        constrictorEg2 obj1 = new constrictorEg2(7);
        System.out.println(obj1.x);
        
        Class2 obj2 = new Class2(12);
        System.out.println(obj2.x);
    }
}

class Class2 {
    int x;

    public Class2(int x) {
        this.x = x;
    }
}
class Class3 {
    String name;
    int age;

    public Class3(String name) {
        this.name = name;
        this.age = age;
    }
    
    
}
