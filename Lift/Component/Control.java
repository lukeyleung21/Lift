package Component;
import java.util.ArrayList;
interface Control{
    final int top_floor=9;
    public static ArrayList<Integer> stop_list= new ArrayList<Integer>();
    public void goUp() throws InterruptedException;
    public void goDown() throws InterruptedException;
}