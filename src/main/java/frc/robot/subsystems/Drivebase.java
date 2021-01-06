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
import frc.robot.Robot;
import static frc.robot.Constants.DRIVE_CONST.*;

public class Drivebase extends SubsystemBase {

  public WPI_TalonSRX leftMaster = new WPI_TalonSRX(LEFT_MASTER_CAN);
  public WPI_TalonSRX leftFollow = new WPI_TalonSRX(LEFT_FOLLOW_CAN);
  public WPI_TalonSRX rightMaster = new WPI_TalonSRX(RIGHT_MASTER_CAN);
  public WPI_VictorSPX rightFollow = new WPI_VictorSPX(RIGHT_FOLLOW_CAN); 
 
  public Drivebase() {
    rightMaster.setInverted(true);
    leftFollow.follow(leftMaster);
    rightFollow.follow(rightMaster);
  }

  public void drive(double leftDrive,double rightDrive) {
    leftMaster.set(leftDrive);
    rightMaster.set(rightDrive);
  }
  public void rotate(double speed) {
    leftMaster.set(speed);
    rightMaster.set(-speed);
  }

  @Override
  public void periodic() {
    drive(RobotContainer.stick.getRawAxis(1) * 0.6, RobotContainer.stick.getRawAxis(5) * 0.6);
  }
}

