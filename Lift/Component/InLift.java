package Component;
import java.util.ArrayList;
import java.util.Collections;

public abstract class InLift implements Control{
    private ArrayList<Integer>p_stop = new ArrayList<Integer>();
    private boolean Door;
    private int now_floor;
    private Thread thread;
    public void goUp() throws InterruptedException{
        int hNumber = Collections.max(stop_list);
        for(int x=this.now_floor;x<=hNumber;x++){
            System.out.println(x);
            hNumber = Collections.max(stop_list);
            this.now_floor = x;
            if(stop_list.contains(this.now_floor)){
                Door = true;
                System.out.println("Stop");
                p_stop.remove(p_stop.indexOf(x));
                thread.sleep(200);
                Door = false;
            }
        }
    }
    public void goDown() throws InterruptedException {
        int hNumber = Collections.min(stop_list);
        for(int x = this.now_floor;x>=hNumber;x--){
            System.out.println(x);
            hNumber = Collections.min(stop_list);
            this.now_floor = x;
            if(stop_list.contains(this.now_floor)){
                Door = true;
                System.out.println("Stop");
                p_stop.remove(p_stop.indexOf(x));
                thread.sleep(200);
                Door = false;
            }
        }
    }
    public abstract void allocate() throws InterruptedException;
    public int get_now(){return this.now_floor;}
    public void give(int x) throws InterruptedException{
        this.p_stop.add(x);
        this.execute();
    }
    public void execute() throws InterruptedException {
        int x = Collections.max(this.p_stop);
           if(this.now_floor > x){
            goDown();
        }
            else{goUp();}
        }
        
    }