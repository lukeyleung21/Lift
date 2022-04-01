package Lift_1_Component;
public class Lift_1{
        public void set_Stop_level(int x) throws Exception{
            Level_Control a = new Level_Control();
            a.set_Stop_level(x);
        }
        public void Go(boolean x) throws Exception{
        Go go = new Go();
            if(x == true){          //true = up  false == down
                go.goUp();
            }
            else{go.goDown();}
        }
    
}