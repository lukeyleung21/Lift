package Level;
import java.util.ArrayList;
import Lift.Lift_1;
public class Level_Control extends Lift_1{
    public int now_level=0;
    public final int top_level=10;
    public ArrayList<Integer> Stop_list;
    public ArrayList<Integer> get_Stop_level(){return Stop_list;}
    public void set_Stop_level(int x){
        this.Stop_list.add(x);
    }
    public int get_now_level(){return now_level;}
    public void set_now_level(int x){
        this.now_level =x;
    }
}
