package Lift;
import java.util.ArrayList;

import Button.*;
import Level.*;
public class Lift_1{
    public static boolean Door = false;
    public static void main(String[] args){
        goDown x = new goDown();
        Level_Control c = new Level_Control();
        c.set_Stop_level(15);
        x.goDown(c.get_now_level(),c.get_Stop_level());
        
        
    }
}