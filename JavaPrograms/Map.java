import java.util.*;
import java.util.Scanner;
public class Map {
    public static void main(String[] args) {
       HashMap<Integer,String> map =new HashMap<Integer,String>();
        

         map.put(10,"ten");
         map.put(20,"twenty");
         map.put(30,"thirty");
         map.put(40,"fourty");
         while(true)
         {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a choice :");
            System.out.println("1,dissplay values");
            System.out.println("2,Display single value");
            System.out.println("3,Removevalue");
            System.out.println("4. Quit :");
            int c=sc.nextInt();
        if(c==1){
            System.out.println("Map is"+map);
            }
        else if(c==2){
                System.out.println("Enter Key to display value..");
            int key=sc.nextInt();
            if(map.containsKey(key))
            {
              String val=map.get(key);
              System.out.println("value is :"+val);
            }
            else{
                System.out.println("No such key in map");
            }
        }
        if(c==4){
            break;
            }
    
         }
    }
}
