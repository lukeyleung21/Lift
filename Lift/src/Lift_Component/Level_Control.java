package Level;
import java.util.ArrayList;
import Lift.Lift_1;
public class Level_Control extends Lift_1{
    private int now_level=10;
    private final int top_level=10;
    private ArrayList<Integer> Stop_list=new ArrayList<>();
    public ArrayList<Integer> get_Stop_level(){return Stop_list;}
    public void set_Stop_level(int x){
        this.Stop_list.add(x);
    }
    public int get_now_level(){return now_level;}
    public void set_now_level(int x){
        this.now_level =x;
    }
}
