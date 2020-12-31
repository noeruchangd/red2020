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
import static frc.robot.Constants.CLAMP_CONST.*;

public class Grip extends SubsystemBase {
  public WPI_VictorSPX clampMotor = new WPI_VictorSPX(CLAMP_CAN);
  public Grip() {
    // nothing yo
  }
  public void clampIn(double inward) {
    clampMotor.set(inward);
  }
  public void clampOut(double outward) {
    clampMotor.setInverted(true);
    clampMotor.set(outward);
  }

  @Override
  public void periodic() {
    if ((RobotContainer.stick.getRawButtonPressed(3))) {
      clampIn(0.8);
    }
    if ((RobotContainer.stick.getRawButtonPressed(2))) {
      clampOut(0.8);
    }
  }
}
// dit me vscode ngu vai lon

