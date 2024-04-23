
package Loopings;


public class BreakAndContainue {
    public static void main(String[] args) {
        System.out.println("Break");
        for(int i=0; i < 10; i++ ){
            if(i == 4){
                break;
            }
            System.out.println(i);
        }
        //containue
        System.out.println("Containue");
        for(int j = 0; j < 10; j++){
            if(j == 4){
                continue;
            }
            System.out.println(j);
        }
    }
}
