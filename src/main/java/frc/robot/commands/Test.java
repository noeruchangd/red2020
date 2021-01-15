// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivebase;

public class Test extends CommandBase {
  private static Drivebase test;
  private double a;
  private double b;
  private double c;

  private boolean finished;

  /** Creates a new Test. */
  public Test(Drivebase t, double d, double e, double f) {
    addRequirements(t);
    test = t;
    a=d;
    b=e;
    c=f;
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    test.drive(-0.6, 0.6);
    Timer.delay(a);
    test.drive(-0.52, -0.5);
    Timer.delay(b);
    test.drive(0.4, -0.4);
    Timer.delay(c);
    test.drive(-0.52, -0.5);
    Timer.delay(3.7);
    test.drive(0.4,-0.4);
    Timer.delay(0.5);
    test.drive(-0.72, -0.7);
    Timer.delay(4);
    test.drive(0, 0);
    finished = true;
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {

  }
     
  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return finished;
  }
}
