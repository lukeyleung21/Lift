
import Lift_Component.*;
import java.util.Scanner;


public class Lift_Control {
    public static void main(String[] args) throws Exception{
        int a;
        Lift_1 L1 = new Lift_1();
        Lift_2 L2 = new Lift_2();

        Scanner scan = new Scanner (System.in);
        while(true){
            
            System.out.printf("'input floor : ");
            int input = scan.nextInt();
            int L1_level = Math.abs(L1.L1_now_level()- input);
            int L2_level = Math.abs(L2.L2_now_level()- input);
            if (L1_level <= L2_level){
                a=1;
                System.out.printf("%d %d %n" ,L1.L1_now_level(), a);
                L1.move(input);
            }
            else{
                a=2;
                System.out.printf("%d %d %n" ,L2.L2_now_level(), a);
                L2.move(input);
            }
        }
    }    
}
