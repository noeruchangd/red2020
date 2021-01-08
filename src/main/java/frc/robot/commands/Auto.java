/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.subsystems.Drivebase;
import frc.robot.subsystems.Grip;
import frc.robot.subsystems.Lift;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/latest/docs/software/commandbased/convenience-features.html
public class Auto extends SequentialCommandGroup {
  /**
   * Creates a new Auto.
   */
  public Auto(Drivebase drive, Lift lift, Grip grip) {
    
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());
<<<<<<< HEAD
  //   super(new Turn(bucac), new WaitCommand(0.1), new StraightDrive(bucac), new WaitCommand(0.1), new Turn(bucac), new WaitCommand(1), new StraightDrive(bucac), new WaitCommand(1), new GripAuto(kep), new WaitCommand(1), new LiftAuto(bulon), new WaitCommand(1),  
  //   new Turn(bucac), new StraightDrive(bucac), new Turn(bucac), new StraightDrive(bucac), new Turn(bucac), new StraightDrive(bucac), new LiftAuto(bulon), new GripAuto(kep),new WaitCommand(1),  
  //   new Turn(bucac), new StraightDrive(bucac), new Turn(bucac), new StraightDrive(bucac), new Turn(bucac), new StraightDrive(bucac), 
  //   new Turn(bucac), new StraightDrive(bucac), new WaitCommand(0.6),    );
       super(new GoStraightThenTurn(drive,90 ,123 ))
=======
    super(new StraightDrive(bucac), new WaitCommand(7), new LiftAuto(bulon));
>>>>>>> 2e4049308be84aaeda5142953269a1d1e29c0cdb
  }
}
