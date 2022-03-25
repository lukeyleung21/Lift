package Lift.src.Lift_Component;
import java.util.ArrayList;
public class goDown extends Door{
    public void goDown(int now_level,ArrayList<Integer> Stop_list){
        int x = now_level;
        Door door = new Door();
        while(x!=0){
            for(int temp=0;temp<Stop_list.size();temp++)            //condition of Stop_list
            {
                if(x == Stop_list.get(temp)){
                    door.Door=door.setDoor();
                                                        //在這里設開門時間
                    door.Door=door.setDoor();
                }
            }
            x-=1;
        }
    }
}