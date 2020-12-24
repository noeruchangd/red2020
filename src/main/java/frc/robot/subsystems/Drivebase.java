/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;
import frc.robot.Robot;

public class Drivebase extends SubsystemBase {
  public VictorSP leftMaster = new VictorSP(0);
  public VictorSP leftFollow = new VictorSP(1);
  public VictorSP rightMaster = new VictorSP(2);
  public WPI_VictorSPX rightFollow = new WPI_VictorSPX(3); 
 // TODO: correct ports later
  public Drivebase() {
    rightMaster.setInverted(true);
    rightFollow.setInverted(true);
  }
  public void drive(double x,double y) {
    leftMaster.set(x);
    rightMaster.set(y);
    leftFollow.set(x);
    rightFollow.set(y);
    // lmao yeet
  }
  @Override
  public void periodic() {
    drive(RobotContainer.stick.getRawAxis(1) * 0.4, RobotContainer.stick.getRawAxis(5) * 0.4);
  }
}
// test
