/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;

import static frc.robot.Constants.DRIVE_CONST.*;

public class Drivebase extends SubsystemBase {

  public WPI_TalonSRX leftMaster = new WPI_TalonSRX(LEFT_MASTER_CAN);
  public WPI_TalonSRX leftFollow = new WPI_TalonSRX(LEFT_FOLLOW_CAN);
  public WPI_VictorSPX rightMaster = new WPI_VictorSPX(03);
  public WPI_VictorSPX rightFollow = new WPI_VictorSPX(04); 
 
  public Drivebase() {
    leftFollow.follow(leftMaster);
    rightFollow.follow(rightMaster);
    leftMaster.setInverted(true);
    leftFollow.setInverted(true);
  }

  public void drive(double leftDrive,double rightDrive) {
    leftMaster.set(leftDrive);
    rightMaster.set(rightDrive);
  }

  @Override
  public void periodic() {
    double multiplier = RobotContainer.stick.getRawButton(8) ? 0.8 : 0.4;


    drive(RobotContainer.stick.getRawAxis(1) * (multiplier + 0.05), RobotContainer.stick.getRawAxis(3) * multiplier);
  }
}