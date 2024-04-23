
package Array;


public class multiTable {
    public static void main(String[] args) {
        int [] arr_0 = {1,2,3,4};
        int i,into;
        for(i=0;i<=12;i++){
            for(int ali = 0; ali <=arr_0.length;ali++){
                into = (arr_0[ali]*i);
                System.out.println(arr_0[ali]+"X"+i+"="+into+"\t");
            }System.out.println("\n");
        }
        
}
}
