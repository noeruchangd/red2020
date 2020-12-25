/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final class DRIVE_CONST {
        public static final int
        LEFT_MASTER_CAN = 1,
        LEFT_FOLLOW_CAN = 2,
        RIGHT_MASTER_CAN = 3,
        RIGHT_FOLLOW_CAN = 4;
    }
    public static final class LIFT_CONST {
        public static final int
        LIFT_LEFT_CAN = 5,
        LIFT_RIGHT_CAN = 6;
    }
    public static final class CLAMP_CONST {
        public static final int
        CLAMP_PWM = 1;
    }
}
// TODO: correct numbers after tuner connected