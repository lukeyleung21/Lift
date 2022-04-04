import Lift_1_Component.*;
import Lift_2_Component.*;
public class Lift{
    public static void main(String[] args) throws Exception{
    Lift_1 lift1 = new Lift_1();
    Lift_2 lift2 = new Lift_2();
        lift1.set_Stop_level(10);
        lift2.set_Stop_level(5);
        lift1.Go(true);
        lift2.Go(true);
    }
}