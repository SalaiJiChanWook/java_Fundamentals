package OOPconcept;

public class objectExample {

    String name = "Hello";
    int age = 12;

    public static void main(String[] args) {
        objectExample obj1 = new objectExample();//object 1
        System.out.println(obj1.name);

        objectExample obj2 = new objectExample();//object 2
        System.out.println(obj2.name);

        objectExample obj3 = new objectExample();
        System.out.println(obj1.name + " " + obj3.age);
    }
}
