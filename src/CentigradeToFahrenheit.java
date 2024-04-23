import java.util.Scanner;
public class CentigradeToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Centigrade: ");
        double centi = sc.nextDouble();
        double fahrem = (9/5.0) * centi + 32;
        System.out.println(fahrem + " F");
        System.out.println("Enter the Fahrenheit: ");
        double f = sc.nextDouble();
        double c = ((f-32)*5/9.0);
        System.out.println(c + "c");
        
    }
}
