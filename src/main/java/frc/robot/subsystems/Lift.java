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
  public WPI_VictorSPX lift_1 = new WPI_VictorSPX(LIFT_LEFT);
  public WPI_VictorSPX lift_2 = new WPI_VictorSPX(LIFT_RIGHT);
  public Lift() {
    lift_2.follow(lift_1);
    }
  public void up(double height) {
    lift_1.set(height);
    };
  public void down(double lole){
    lift_1.setInverted(true);
    // inverts output
    lift_1.set(lole);  
  }
  
  @Override
  public void periodic() {
    if ((RobotContainer.stick.getRawAxis(2) != 0)) {
      up(RobotContainer.stick.getRawAxis(2));
    }
    else {
      down(RobotContainer.stick.getRawAxis(3));
    }
  }
}
// dit me vscode ngu vai lon

