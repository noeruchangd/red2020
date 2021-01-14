/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;


import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivebase;

public class StraightDrive extends CommandBase {
  private static Drivebase db;
  
  /**
   * Creates a new StraightDrive.
 *
   */
  public StraightDrive(Drivebase driver){
    
    addRequirements(driver);
    // Use addRequirements() here to declare subsystem dependencies.
    db = driver;
    
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    
     db.drive(-0.45,-0.42);;
     Timer.delay(8);
     db.drive(0, 0);
     Timer.delay(0.01);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
