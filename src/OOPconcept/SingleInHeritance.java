
package OOPconcept;

class ClassA {
    int num1,num2;
    void display (){
        System.out.println("Addition from ClassA: "+ (num1+num2));
    }
}
class ClassB {
    int num3;
    void show() {
        System.out.println("Fromme class B: "+ num3);
    }
}
public class SingleInHeritance {
    public static void main(String[] args) {
        ClassB obj = new ClassB();
        obj.num3 = 20;
        
        ClassA obj1 = new ClassA();      
        obj1.num1 = 30;
        obj1.num2=20;}
    
}
