
package OOPconcept;


public class objecteg3 {
    public static void main(String[] args) {
        FinalEg obj1 = new FinalEg();
        //obj1.x = 12; --error
        System.out.println(obj1.x);
        
        First obj2 = new First();
        First obj3 = new First();
        obj3.x = 20;
        System.out.println(obj2.x);
        System.out.println(obj3.x);
    }
}


class FinalEg{
   final int x = 10;
}

class First{
    int x = 10;
}