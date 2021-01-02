//Prac4

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package linefollower;
import ch.aplu.robotsim.*;

/**
 *
 * @author lenovo
 */
public class LineFollower {
LineFollower(){
LegoRobot robot= new LegoRobot();
Gear gear=new Gear();
LightSensor ls= new LightSensor(SensorPort.S3);
robot.addPart(gear);
gear.setSpeed(20);
robot.addPart(ls);
while(true){
    int v = ls.getValue();
    if(v<100)
        gear.forward();
    if(v>300 && v<750)
        gear.leftArc(0.05);
    if(v>800)
        gear.rightArc(0.05);
                
}



}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    new LineFollower();
      
    }
    static{
    RobotContext.setStartPosition(50,490);
    RobotContext.setStartDirection(-90);
    RobotContext.useBackground("sprites/road.gif");
            }
    
}
