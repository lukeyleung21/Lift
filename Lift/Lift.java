import java.util.Scanner;
import Component.*;
public class Lift extends InLift implements LiftInput,Runnable{
    Scanner scan = new Scanner(System.in);
    Thread t;
    public static void main(String[] args) throws InterruptedException{
        Lift L = new Lift();
        Thread t = new Thread(L);
        t.start();
    }
    @Override
    public void allocate() throws InterruptedException{
        int x = scan.nextInt();
        if(x>top_floor || x<0 || stop_list.contains(x)){
            System.out.println(x);
        }else{stop_list.add(x);}
        int Diff_1 = Math.abs(L1.get_now() - x);
        int Diff_2 = Math.abs(L2.get_now() - x);
        if(Diff_1<=Diff_2){
            L1.give(x);
            int temp = stop_list.indexOf(x);
            stop_list.remove(temp);
        }else{L2.give(x);
            int temp = stop_list.indexOf(x);
            stop_list.remove(temp);}
        allocate();
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        try {
            allocate();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
        }
    }
}