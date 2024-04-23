
package arrayList;
import java.util.Iterator;
import java.util.ArrayList;
public class arrayListeg {
    public static void main(String[] args) {
        //Int array1[] = new int[9]; //array create
        ArrayList<Integer> al1 = new ArrayList<>();
        
        //Array (abstract data type) => add, remove, output
        al1.add(20); //0
        al1.add(10); //1
        al1.add(30); //2
        
        //itreator , For eacg
    //    for(int a : al1) {
      //      System.out.println(a);
        //}
        
        Iterator itr = al1.iterator();
        while(itr.hasNext()){
            int a = (int) itr.next();
            System.out.println(a);
        }
        
        //remove 
        al1.remove(1);
        
        for(int b : al1){
            System.out.println(b);
        }
    }
}
