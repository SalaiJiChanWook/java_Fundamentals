package Array;

import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array1[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        String choice;
        System.out.println(array1[0]);
        while (true) {
            System.out.println("သိချင်တဲ့မြောက်ဖော်ကိန်းကိုထည့်ပါ..: ");
            int x = sc.nextInt();
            for (int a = 0; a < array1.length; a++) {
                System.out.println(x + " X " + (array1[a]) + " = " + (x * array1[a]));
            }
            System.out.println("**************************\n");
            while (true) {
                System.out.println("ဆက်လုပ်ချင်လား?: Yes/No\n");
                choice = sc.next();
                if (choice.equalsIgnoreCase("No")) {
                    System.out.println("ထွက်ပြီနော်...\n");
                    break;
                }
                if (choice.equalsIgnoreCase("Yes")) {
                    System.out.println("သဘောဘဲ...လေ\n");
                    break;
                } else {
                    System.out.println("ပေးထားတာတွေဘဲရိုက်ထည့်ရမှာလေကွာ!!! \n");
                }
            }

            if (choice.equalsIgnoreCase("No")) {
                while (true) {
                    System.out.println("ထွက်မှာသေချာပါတယ်နော်...yes/No\n");
                    choice = sc.next();
                    if (choice.equalsIgnoreCase("Yes")) {
                        choice = "no";
                        break;
                    }
                    if (choice.equalsIgnoreCase("No")) {
                        System.out.println("ဒါဆိုလည်း..မထွက်တော့ဘုးနော်..\n");
                        choice = "yes";
                        break;
                    } else {
                        System.out.println("ပေးထားတာတွေဘဲရိုက်ထည့်ရမှာလေကွာ!!! \n");
                    }

                }
            }
            if (choice.equalsIgnoreCase("Yes")) {
                System.out.println("ဆက်လက်လုပ်ဆောင်နေပါပြီ...\n");
            }
            if (choice.equalsIgnoreCase("No")) {
                break;
            }
        }
    }

}
