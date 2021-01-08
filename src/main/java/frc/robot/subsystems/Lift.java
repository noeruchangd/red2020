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
import static frc.robot.Constants.LIFT_CONST.*;


public class Lift extends SubsystemBase {
  public WPI_TalonSRX lift_1 = new WPI_TalonSRX(LIFT_CAN);
  public Lift() {
    //nothing
  }
  public void elevate(double height) {
    lift_1.set(height);
  }; 
  @Override
  public void periodic() {
      elevate(RobotContainer.stick.getRawAxis(2) * 0.6);
    }
  }

