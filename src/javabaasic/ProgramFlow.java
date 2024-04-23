
package javabaasic;

import java.io.IOException;
public class ProgramFlow {
    public static void main(String[] args) throws IOException {
        while(true){
        System.out.println("Enter a operator: (+,-,*,%) : ");   
        char operator = (char) System.in.read();
        
        switch(operator){
            case '+': System.out.println("Addition");break;
            case '-':System.out.println("Substraction");break;
            case'/':System.out.println("Division");break;
            case'*':System.out.println("Multiplaction");break;
            case'%':System.out.println("Modules");break;
        }
    }
    }
}
