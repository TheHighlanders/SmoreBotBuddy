// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class SmoreShooter extends SubsystemBase {
  /** Creates a new SmoreShooter. */
  public DoubleSolenoid up;
  public DoubleSolenoid down;
  public Compressor airtank;


  public SmoreShooter() {
    up = new DoubleSolenoid(Constants.UP_1,Constants.UP_2);
    down = new DoubleSolenoid(Constants.DOWN_1, Constants.DOWN_2);
    airtank = new Compressor(Constants.AIR_TANK);



  }
  public void extendup(){
    up.set(DoubleSolenoid.Value.kForward);
  }
  public void contractdown(){
    down.set(DoubleSolenoid.Value.kReverse);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
