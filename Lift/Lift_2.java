import Lift_Component.*;
public class Lift_2 {
    public static void main(String[] args)throws Exception{
        Go x = new Go();
        Level_Control c = new Level_Control();
        c.set_Stop_level(10);
        c.set_Stop_level(0);
        x.goDown(c);
        x.goUp(c);
}
}