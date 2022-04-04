package Lift_1_Component;

public class Lift_1{
    public void set_Stop_level(int x) throws Exception{
        Level_Control a = new Level_Control();
            
        a.set_Stop_level(x);
    }

    public void Go(boolean x) throws Exception{
    Go go = new Go();
        if(x == true){
            go.goDown();
        }
        else{go.goUp();}
    }

    public int now_level() throws Exception{
        Level_Control a = new Level_Control();
        int now = a.get_now_level();
        return now;
    }

    public void move(int x) throws Exception{
        Level_Control a = new Level_Control();
        Go go = new Go();
        if(x < a.get_now_level()){
            go.goDown();
        }
        else{
            go.goUp();
        }
    }
}