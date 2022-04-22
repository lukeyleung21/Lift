import java.util.ArrayList;
import java.util.Collections;

public class Lift_Control{
    private final int top_floor=10;
    private ArrayList<Integer>p_stop = new ArrayList<Integer>();    //Single Stop List
    private int now_floor=1;
    private boolean Up_Down;
//-- Data Initial above --

    public void goUp(){
        int hNumber = Collections.max(this.p_stop);
        int x = this.now_floor;
        do{
            if(this.p_stop.contains(this.now_floor)){
                p_stop.remove(p_stop.indexOf(x));
            }
        x++;
        this.now_floor = x;
        }while(x<hNumber);
    }
    public void goDown(){
        int hNumber = Collections.min(this.p_stop);
        int x=this.now_floor;
        do{
            if(this.p_stop.contains(this.now_floor)){
                p_stop.remove(p_stop.indexOf(x));
            }
        x--;
        this.now_floor = x;
        }while(x>hNumber);
    }

    public void allocate_Lift(int x){
        this.p_stop.add(x);
        this.execute();
    }

    public void execute(){
        int x = Collections.max(this.p_stop);
        if(this.now_floor >= x){
            this.Up_Down = true;   //false = up , true = down
            this.goDown();
        }
            else{
            this.Up_Down = false;    //false = up , true = down
            this.goUp(); 
            }
        }

    public int get_now_Level() {
        return this.now_floor;
    }

    public int get_top_Level(){
        return this.top_floor;
    }
    public boolean getUP_Down() {
        return this.Up_Down;       
    }
    public Lift_Control New_Lift(){
        return new Lift_Control();
    }
}
