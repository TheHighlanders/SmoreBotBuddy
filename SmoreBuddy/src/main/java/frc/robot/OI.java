package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.Joystick;

public class OI {
  public XboxController xbox = new XboxController(0);
public OI() {

 }
 
 Joystick Logi = new Joystick(0);

 public double getLogiY(){
     return Logi.getY();
 };
 public double getLogiX(){
    return Logi.getX();
 };


 public double getXboxLeftX(){
    return xbox.getX(GenericHID.Hand.kLeft);
}
public double getXboxLeftY(){
    return xbox.getY(GenericHID.Hand.kLeft);
}
public double getXboxRightX(){
    return xbox.getY(GenericHID.Hand.kRight);
}
public double getXboxRightY(){
    return xbox.getY(GenericHID.Hand.kRight);
}


    
}
