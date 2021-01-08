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
// information, see:0
// https://docs.wpilib.org/en/latest/docs/software/commandbased/convenience-features.html
public class Auto extends SequentialCommandGroup {
  /**
   * Creates a new Auto.
   */
  public Auto(Drivebase drive, Lift lift, Grip grip) {
    
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());

      super(new GoStraightThenTurn(Ishar, angle, distance), new StraightDrive(drive, d), new StraightDrive(drive, d), new GoStraightThenTurn(Ishar, angle, distance)
      //  super(new GoStraightThenTurn(drive, 145 ,50 ), new GoStraightThenTurn(drive, angle, distance), 
      //  new GripIn(grip), new  GoStraightThenTurn(drive, angle, distance), new GoStraightThenTurn(drive, angle, distance), new GoStraightThenTurn(drive, angle, distance),
      //  new GripOut(grip), new GoStraightThenTurn(drive, angle, distance), new GoStraightThenTurn(drive, angle, distance), new GoStraightThenTurn(drive, angle, distance), new Turn(drive, a),
      //   new LiftUp(lift), new GripIn(grip), new  GoStraightThenTurn(drive, angle, distance), new GoStraightThenTurn(drive, angle, distance), new GoStraightThenTurn(drive, angle, distance),
      //   new LiftDown(lift), new GripOut(grip),new  GoStraightThenTurn(drive, angle, distance), new GoStraightThenTurn(drive, angle, distance), new GoStraightThenTurn(drive, angle, distance),
      //   new LiftUp(lift), new GripIn(grip), new  GoStraightThenTurn(drive, angle, distance), new GoStraightThenTurn(drive, angle, distance), new GoStraightThenTurn(drive, angle, distance),
      //   new LiftDown(lift), new GripOut(grip),new  GoStraightThenTurn(drive, angle, distance), new GoStraightThenTurn(drive, angle, distance), new GoStraightThenTurn(drive, angle, distance),   )  ;
       }
  }


