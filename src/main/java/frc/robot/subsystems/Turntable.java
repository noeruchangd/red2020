/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;


import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;
import frc.robot.Robot;
import static frc.robot.Constants.TURN_CONST.*;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;


public class Turntable extends SubsystemBase {
  public WPI_TalonSRX quay = new WPI_TalonSRX(TURNTABLE_CAN);
  public Turntable() {
    //nothing
    }
  public void cock(double spin) {
    quay.set(spin);
    };
  @Override
  public void periodic() {
    if (RobotContainer.stick.getRawButton(2)) {
      cock(0.8);
   }
    else if (RobotContainer.stick.getRawButton(4)) {
      cock(-0.8);
   }
   else if ((RobotContainer.stick.getRawButton(2) & RobotContainer.stick.getRawButton(4)) == false) {
 cock(0);
   }
  }
}

