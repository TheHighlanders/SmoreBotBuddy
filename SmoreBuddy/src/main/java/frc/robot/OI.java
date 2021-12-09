package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;

public class OI {
  public XboxController xbox = new XboxController(Constants.XBOX);
public OI() {

 }

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
