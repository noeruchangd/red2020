/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;
import frc.robot.Robot;

public class Drivebase extends SubsystemBase {
  public VictorSP left = new VictorSP(0);
  public VictorSP right = new VictorSP(1);
  public WPI_TalonSRX helo = new WPI_TalonSRX(2);
  public Drivebase() {
    right.setInverted(true);
  }
  public void drive(double x,double y) {
    left.set(x);
    right.set(y);
  }
  @Override
  public void periodic() {
    drive(RobotContainer.stick.getRawAxis(1), RobotContainer.stick.getRawAxis(2));
  }
}
