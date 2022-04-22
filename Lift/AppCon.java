import java.util.ArrayList;
import HelpButton.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class AppCon{
    public static ArrayList<Integer> stop_list= new ArrayList<Integer>();
    int number;
    double LiftLeft_Y , LiftRight_Y;
    CallHelp Help = new CallHelp();
    CallPolice Police = new CallPolice();
    boolean Left_LiftRun=false,Right_LiftRun=false;
    Lift_Control L1 = new Lift_Control();
    Lift_Control L2 = new Lift_Control();

    @FXML
    private Button CallHelp = new Button();

    @FXML
    private Button CallPolice = new Button();

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
    private Button Start = new Button();

    @FXML
    private Button StopButton1 = new Button();

    @FXML
    private Button StopButton2 = new Button();

    @FXML
    private Button Stop_All = new Button();

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
    

    public void HelpFunction(ActionEvent event) {
        Help.press();
    }
    public void PoliceFunction(ActionEvent event){
        Police.press();
    }
    public void Check() throws InterruptedException {
        if(Left_LiftRun ==false && Right_LiftRun == false){}
        else if(First_Floor.isSelected()){this.number = 1;this.allocate();}
        else if(Second_Floor.isSelected()){this.number = 2;this.allocate();}
        else if(Third_Floor.isSelected()){this.number = 3;this.allocate();}
        else if(Fourth_Floor.isSelected()){this.number = 4;this.allocate();}
        else if(Fifth_Floor.isSelected()){this.number = 5;this.allocate();}
        else if(Sixth_Floor.isSelected()){this.number = 6;this.allocate();}
        else if(Seventh_Floor.isSelected()){this.number = 7;this.allocate();}
        else if(Eighth_Floor.isSelected()){this.number = 8;this.allocate();}
        else if(Ninth_Floor.isSelected()){this.number = 9;this.allocate();}
        else if(Tenth_Floor.isSelected()){this.number = 10;this.allocate();;}
    }

    public void allocate(){
        this.getLiftPosition();
        int x = this.number;
        if((x>L1.get_top_Level() && x>L2.get_top_Level()) || x<0 || stop_list.contains(x)){
        }else{stop_list.add(x);}
        int Diff_1 = Math.abs(L1.get_now_Level() - x);
        int Diff_2 = Math.abs(L2.get_now_Level() - x);
        if(Left_LiftRun == false && Right_LiftRun == true){
            L2.allocate_Lift(x);
            this.delete_stop_list(x);
            this.moveR(Diff_2);
        }else if(Right_LiftRun == false && Left_LiftRun == true){
            L1.allocate_Lift(x);
            this.delete_stop_list(x);
            this.moveL(Diff_1);}
            
            // Special Judgement
        else{
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
        }}
    }
    
    void moveL(int x){
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

    @FXML
    void Lift_On(ActionEvent event) {
        Left_Lift.setFill(Color.rgb(30,144,255));
        Right_Lift.setFill(Color.rgb(30,144,255));
        this.Left_LiftRun=true;
        this.Right_LiftRun=true;
    }

    @FXML
    void Switch_Left(ActionEvent event) {
        if(this.Left_LiftRun==true){
        this.Left_LiftRun=false;
        Left_Lift.setFill(Color.rgb(204, 204, 204));}
        else{this.Left_LiftRun=true;Left_Lift.setFill(Color.rgb(30,144,255));};  
    }

    @FXML
    void Switch_Right(ActionEvent event) {
        if(this.Right_LiftRun==true){
            this.Right_LiftRun=false;
            Right_Lift.setFill(Color.rgb(204, 204, 204));}
            else{this.Right_LiftRun=true;Right_Lift.setFill(Color.rgb(30,144,255));};  
        }

    @FXML
    void Stop_All(ActionEvent event) {
        this.Left_LiftRun=false;
        this.Right_LiftRun=false;
        Left_Lift.setFill(Color.rgb(204, 204, 204));  
        Right_Lift.setFill(Color.rgb(204, 204, 204)); 

    }
}