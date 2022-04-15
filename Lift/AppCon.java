import java.util.ArrayList;

import Door.Door;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class AppCon implements Input,Door{
    public static ArrayList<Integer> stop_list= new ArrayList<Integer>();
    int number;
    double LiftLeft_Y , LiftRight_Y;
    @FXML
    private CheckBox Eighth_Floor = new CheckBox();

    @FXML
    private CheckBox Fifth_Floor = new CheckBox();

    @FXML
    private CheckBox First_Floor = new CheckBox();

    @FXML
    private CheckBox Fourth_Floor = new CheckBox();

    @FXML
    private Rectangle Left_Lift = new Rectangle();

    @FXML
    private CheckBox Ninth_Floor = new CheckBox();

    @FXML
    private Rectangle Right_Lift = new Rectangle();

    @FXML
    private CheckBox Second_Floor = new CheckBox();

    @FXML
    private CheckBox Seventh_Floor = new CheckBox();

    @FXML
    private CheckBox Sixth_Floor = new CheckBox();

    @FXML
    private CheckBox Third_Floor = new CheckBox();

    @FXML
    private CheckBox Tenth_Floor = new CheckBox();
    
    public void Check() throws InterruptedException {
        if(First_Floor.isSelected()){
           this.number = 1;
        }
        else if(Second_Floor.isSelected()){this.number = 2;}
        else if(Third_Floor.isSelected()){this.number = 3;}
        else if(Fourth_Floor.isSelected()){this.number = 4;}
        else if(Fifth_Floor.isSelected()){this.number = 5;}
        else if(Sixth_Floor.isSelected()){this.number = 6;}
        else if(Seventh_Floor.isSelected()){this.number = 7;}
        else if(Eighth_Floor.isSelected()){this.number = 8;}
        else if(Ninth_Floor.isSelected()){this.number = 9;}
        else if(Tenth_Floor.isSelected()){this.number = 10;}
        this.allocate();
    }

    public void allocate(){
        this.getLiftPosition();
        int x = this.number;
        if((x>L1.get_top_Level() && x>L2.get_top_Level()) || x<0 || stop_list.contains(x)){
        }else{stop_list.add(x);}
        int Diff_1 = Math.abs(L1.get_now_Level() - x);
        int Diff_2 = Math.abs(L2.get_now_Level() - x);
        if(Diff_1 == 0 && Diff_2 != 0){
            L2.allocate_Lift(x);
            this.delete_stop_list(x);
            this.moveR(Diff_2);
        }
        if(Diff_2 == 0 && Diff_1 !=0){
            L1.allocate_Lift(x);
            this.delete_stop_list(x);
            this.moveL(Diff_1);}
        if(Diff_1<=Diff_2 && Diff_1 != 0 ){
            L1.allocate_Lift(x);
            this.delete_stop_list(x);
            this.moveL(Diff_1);
        }else if(Diff_2<=Diff_1 && Diff_2 != 0 ){
            L2.allocate_Lift(x);
            this.delete_stop_list(x);
            this.moveR(Diff_2);
        }
    }
    
    void moveL(int x){
        Left_Lift.setFill(Color.rgb(204, 204, 204));
        if(L1.getUP_Down()){
            for(int temp = 0;temp< x;temp++){
            this.LiftLeft_Y += 89;
            this.Left_Lift.setY(this.LiftLeft_Y);
            reset();
        }}else{
            for(int temp = 0;temp< x;temp++){
                this.LiftLeft_Y -= 89;
                this.Left_Lift.setY(this.LiftLeft_Y);
                reset();
        }}}
    void moveR(int x){
        Right_Lift.setFill(Color.rgb(204, 204, 204));  
        if(L2.getUP_Down()){
        for(int temp = 0;temp< x;temp++){
        this.LiftRight_Y += 89;
        this.Right_Lift.setY(this.LiftRight_Y);
        reset();
    }}else{
        for(int temp = 0;temp< x;temp++){
            this.LiftRight_Y -= 89;
            this.Right_Lift.setY(this.LiftRight_Y);
            reset();
    }}}

    void getLiftPosition(){
        LiftLeft_Y = this.Left_Lift.getY();
        LiftRight_Y = this.Right_Lift.getY();
    }

    void reset(){
        switch(this.number){
            case(1):{this.First_Floor.setSelected(false);}
            case(2):{this.Second_Floor.setSelected(false);}
            case(3):{this.Third_Floor.setSelected(false);}
            case(4):{this.Fourth_Floor.setSelected(false);}
            case(5):{this.Fifth_Floor.setSelected(false);}
            case(6):{this.Sixth_Floor.setSelected(false);}
            case(7):{this.Seventh_Floor.setSelected(false);}
            case(8):{this.Eighth_Floor.setSelected(false);}
            case(9):{this.Ninth_Floor.setSelected(false);}
            case(10):{this.Tenth_Floor.setSelected(false);}
        }
    }
    
    void delete_stop_list(int x){
        int temp = stop_list.indexOf(x);
        stop_list.remove(temp);
    }

    @Override
    public void Open() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void Close() {
        // TODO Auto-generated method stub
        
    }

}