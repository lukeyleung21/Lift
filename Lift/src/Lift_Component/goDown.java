package Lift.src.Lift_Component;
import java.util.ArrayList;
public class goDown extends Door{
    public void goDown(Level_Control Level_info){
        int now_level = Level_info.get_now_level();
        int Lower = Level_info.get_lowest_stopList();
        Door door = new Door();
        while(now_level>=Lower){
            System.out.println(now_level);
            for(int temp=0;temp<Level_info.get_Stop_level().size();temp++)            //condition of Stop_list
            {
                
                if(now_level == Level_info.get_Stop_level().get(temp)){
                    System.out.println("Stop");
                    door.Door=door.setDoor();
                                                        //在這里設開門時間
                    door.Door=door.setDoor();
                }
            }
            now_level-=1;
        }
        now_level+=1;
    }
}