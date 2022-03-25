package Button;
import java.util.ArrayList;
import Lift.Lift_1;
public class goDown extends Lift_1{
    public void goDown(int now_level,ArrayList Stop_list){
        int x = now_level;
        while(x!=0){
            if(Stop_list.equals(x)){
                setDoor(Lift_1.Door);
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