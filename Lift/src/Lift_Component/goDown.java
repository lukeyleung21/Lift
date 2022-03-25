package Button;
import java.util.ArrayList;
import Lift.Lift_1;
import Door.*;
public class goDown extends Door{
    public void goDown(int now_level,ArrayList<Integer> Stop_list){
        int x = now_level;
        while(x!=0){
            for(int temp=0;temp<Stop_list.size();temp++)
            {
                if(x == Stop_list.get(temp)){
                    System.out.println(x);
                }
            }
            x-=1;
        }
    }
    public boolean setDoor(boolean door){
        if(door==true){
            return false;
        }
        else{return true;}
    }
}