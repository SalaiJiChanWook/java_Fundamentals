
package Basic.Opreations;


public class Priorty {
    public static void main(String[] args) {
        int l = 10, q = 5, c =1;
        int result = l-++q-++c;
        System.out.println("Result : "+ result);
        int a = 2;
        int b =3;
        System.out.println( a < b ? "A" : "B");
        System.out.println(a > b ? "A" : "B");
        System.out.println(b == a++);
        System.out.println(--b == --a);
        System.out.println(a == b++ && b==3);
        System.out.println(++a == b++ && a< b && a % 2 > 0);
    }
}
