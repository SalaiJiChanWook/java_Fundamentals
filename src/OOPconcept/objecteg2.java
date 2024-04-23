package OOPconcept;

public class objecteg2 {

    public static void main(String[] args) {
        Name obj1 = new Name();
        System.out.println(obj1.name);

        Age obj2 = new Age();
        System.out.println(obj2.age);

        Integer obj3 = new Integer();
        obj3.x = 15;
        System.out.println(obj3.x);

        obj2.age = 20;
        System.out.println(obj2.age);
    }
}

class Name {

    String name = "Hello";
}

class Age {

    int age = 12;
}

class Integer {

    int x;
}
