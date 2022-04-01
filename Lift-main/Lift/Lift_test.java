import Lift_Component.*;
import java.util.Scanner;

public class Lift_test{
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner (System.in);
        
        while(true){
            Level_Control c = new Level_Control();
            int input = scan.nextInt();
            c.set_Stop_level(input);
        }
        
    }
}