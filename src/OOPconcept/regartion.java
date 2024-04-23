package OOPconcept;

public class regartion {

    public static void main(String[] args) {
        System.out.println(sum(10));
    }

    public static int sum (int num) {
        if (num > 0) {
            return num + sum (num - 1);
        } else {
            return 0;
        }
    }
}
