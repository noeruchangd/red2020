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
   super(new Test(drive, 0.3, 4.7, 0.4) );
    
      
    
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());
    //super(new TurnRightThenStraight(drive, 0.3, 0.6),new WaitCommand(0.9), new TurnLeftThenStraight(drive, 0.4, 1), new TurnLeftThenStraight(drive, 0.4, 1), new GripOut(grip, 0.5), new TurnLeftThenStraight(drive, 0.8, 1)) ;

      // super(new TurnThenGoStraight(drive, 55, 8.1),new TurnThenGoStraight(drive, 125, 4.7), new TurnThenGoStraight(drive, 130, 8), 
      // new LiftDown(lift, 0.5), new GripOut(grip, 0.2), new TurnThenGoStraight(drive, 180, 8), new TurnThenGoStraight(drive, 130, 3.3), new TurnThenGoStraight(drive, 90, 1.5),
      // new GripIn(grip, x1), new LiftUp(lift, y1), new TurnThenGoStraight(drive, 180, 1.5), new TurnThenGoStraight(drive, 90, 3.3), new TurnThenGoStraight(drive, 135, 7),
      // new LiftDown(lift, y1), new GripOut(grip, x1), new TurnThenGoStraight(drive, 180, 7), new TurnThenGoStraight(drive, 135, 3.3), new TurnThenGoStraight(drive, 90, 1.3),
      // new LiftUp(lift, y2), new GripIn(grip, x2), new TurnThenGoStraight(drive, 180, 1.3), new TurnThenGoStraight(drive, 90, 3.3), new TurnThenGoStraight(drive, 140, 7.5),
      // new LiftDown(lift, y2), new GripOut(grip, x2) ); 
     
     
      //  super(new GoStraightThenTurn(drive, 145 ,50 ), new GoStraightThenTurn(drive, angle, distance), 
      //  new GripIn(grip), new  GoStraightThenTurn(drive, angle, distance), new GoStraightThenTurn(drive, angle, distance), new GoStraightThenTurn(drive, angle, distance),
      //  new GripOut(grip), new GoStraightThenTurn(drive, angle, distance), new GoStraightThenTurn(drive, angle, distance), new GoStraightThenTurn(drive, angle, distance), new Turn(drive, a),
      //   new LiftUp(lift), new GripIn(grip), new  GoStraightThenTurn(drive, angle, distance), new GoStraightThenTurn(drive, angle, distance), new GoStraightThenTurn(drive, angle, distance),
      //   new LiftDown(lift), new GripOut(grip),new  GoStraightThenTurn(drive, angle, distance), new GoStraightThenTurn(drive, angle, distance), new GoStraightThenTurn(drive, angle, distance),
      //   new LiftUp(lift), new GripIn(grip), new  GoStraightThenTurn(drive, angle, distance), new GoStraightThenTurn(drive, angle, distance), new GoStraightThenTurn(drive, angle, distance),
      //   new LiftDown(lift), new GripOut(grip),new  GoStraightThenTurn(drive, angle, distance), new GoStraightThenTurn(drive, angle, distance), new GoStraightThenTurn(drive, angle, distance),   )  ;
       }
  
  }


