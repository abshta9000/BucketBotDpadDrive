// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.StatorCurrentLimitConfiguration;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class ArmInfoConstants {
    public static final StatorCurrentLimitConfiguration kDriveCurrentLimitAmps = 
    new StatorCurrentLimitConfiguration(
      true, 
      55, // Amps
      55, // Amps 
      100 // MS
    );
  }

  public static class MotorConstants{
    public static final int drivebasePeakCurrent = 40;
    public static final int drivebasePeakCurrentDuration = 10000;
  }

  public static class PortConstants {
    
    public static final int frontrightMotorID = 14;
    public static final int frontleftMotorID = 13;
    public static final int backrightMotorID = 12;
    public static final int backleftMotorID = 11;
    public static final int kDriverControllerPort = 0;
    public static final int kBaseArmPort = 2;
    public static final int kElbowArmPort = 1;
    public static final int kFlywheelPort = 3;
  }

  public static class MechanicalConstants{
    public static final double kGearRatio = 25.0;
    public static final double kforwardSpeed = 0.27;
    public static final double kbackwardSpeed = -0.15; 
  }

}
