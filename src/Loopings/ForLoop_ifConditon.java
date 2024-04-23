
package Loopings;


public class ForLoop_ifConditon {
    public static void main(String[] args) {
        for(int i = 0; i < 10;i++){
            if(i % 2 == 0){
                System.out.println(i + "\t");
            }else{
                System.out.println("Invalid");
            }
        }
    }
}
