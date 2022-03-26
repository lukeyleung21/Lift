package Lift_Component;
import java.util.ArrayList;
import java.util.Iterator;

import Lift_Component.Error_Handle.ExcceedError;
public class Level_Control{
    private int now_level=10;
    private final int top_level=10;
    private ArrayList<Integer> Stop_list=new ArrayList<Integer>();                 //Stop_list
    public ArrayList<Integer> get_Stop_level(){return Stop_list;}
    public void set_Stop_level(int x) throws ExcceedError{
        if(x > this.top_level){throw new ExcceedError("Out of level");}
        this.Stop_list.add(x);
    }
    public int get_now_level(){return now_level;}
    public void set_now_level(int x) throws ExcceedError{
        if(x>this.top_level){throw new ExcceedError("Out of level");}
        this.now_level =x;
    }
    public int get_top_level(){return this.top_level;}
    public int get_highest_stopList(){
        Iterator<Integer> iter = Stop_list.iterator();
        int Highest = 0;
            while(iter.hasNext()){
                int x = iter.next();
                if(Highest < x){
                    Highest = x;
                }        //condition of Stop_list
            }
            return Highest;
    }
    public int get_lowest_stopList(){
        Iterator<Integer> iter = Stop_list.iterator();
        int Lower = top_level;
            while(iter.hasNext()){
                int x = iter.next();
                if(Lower > x){
                    Lower = x;
                }        //condition of Stop_list
            }
            return Lower;
    }
}
