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

public class Lift extends SubsystemBase {
  public VictorSP lift_1 = new VictorSP(3);
  public VictorSP lift_2 = new VictorSP(4);
 // TODO: correct ports later
  public Lift() {
    // nothing yo
    }
  public void up(double height) {
    lift_1.set(height);
    lift_2.set(height);
    // fuck pwm
  };
  public void down(double lole){
    lift_1.setInverted(true);
    lift_2.setInverted(true);
    // inverts output
    lift_1.set(lole);
    lift_2.set(lole);
    // fuck pwm
  };
  
  @Override
  public void periodic() {
    up(RobotContainer.stick.getRawAxis(2));
    down(RobotContainer.stick.getRawAxis(3));
  }
}
// dit me vscode ngu vai lon

