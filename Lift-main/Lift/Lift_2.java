import Lift_Component.*;

public class Lift_2 {
    private int now;
    Go x = new Go();
    Level_Control c = new Level_Control();

    public void move(int level) throws Exception{
        
        c.set_Stop_level(level);
    }

    public int L2_now_level() throws Exception{
        int now = c.get_now_level();
        return now;
    }
}