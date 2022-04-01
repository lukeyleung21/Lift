import Lift_Component.*;
public class Lift_1{
    public static void main(String[] args) throws Exception{
        Level_Control c = new Level_Control();
        c.set_Stop_level(4);
        c.set_Stop_level(0);
        c.set_Stop_level(5);
        c.set_Stop_level(7);
    }
}