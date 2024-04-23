
package Basic.Opreations;

import java.util.Scanner;
public class Exercise_5 {
    public static void main(String[] args) {
            String [] days ={"Day_One","Day_Two",
                "Day_Three","Day_Four","Day_Five"};
          int sum = 0;
        for(int lp = 0;lp < days.length;lp++){
            
         Scanner salary = new Scanner(System.in);
            System.out.println("Input the Salary that you want to give: \n" );
            int Average_Salary = salary.nextInt();
            System.out.println("The Worker got "+Average_Salary+"Kyats in his "+days[lp]+" at work"+"\n");
            
            int One_hour = Average_Salary / 8;
            System.out.println("The Worker got "+One_hour+"Kyats in an hour aday...\n");
            
            int array_store [] = new int [Average_Salary];
            array_store[lp] = Average_Salary ;
            sum += array_store[lp];
    }
           System.out.println("This Worker's total Salary is "+ sum+"Kyats in this week..bro");
    }
   
}
