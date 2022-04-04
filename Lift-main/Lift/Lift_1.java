import Lift_Component.*;
import java.util.ArrayList;


public class Lift_1{
    private int now;
    Go x = new Go();
    Level_Control c = new Level_Control();

    public void move(int level) throws Exception{
        
        c.set_Stop_level(level);
    }
    
    public int L1_now_level() throws Exception{
        int now = c.get_now_level();
        return now;
    }
}