
package Basic.Opreations;

public class exercise_1 {
    public static void main(String[] args) {
        int a, b;
        a = 2;
        b = 3;
        System.out.println(a + b / 2 == 2);//false
        System.out.println(a + b / 2 == 2);//false
        System.out.println(a / b);//0
        System.out.println(b / a);// 1
        System.out.println(a % b);// 2
        System.out.println(b % a);// 1
        System.out.println(a > b);// false
        System.out.println(a != b);// true
        a = 4;
        b = 5;
        System.out.println(a < b ? "A" : "B");// A
        System.out.println(a > b ? "A" : "B");// B
        System.out.println(b == a++);// False
        System.out.println(--b == --a);// True
        System.out.println(a == b++ && b == 3);// False
        System.out.println(++a == b++ && a < b && a % 2 > 0);// True
    }
}
