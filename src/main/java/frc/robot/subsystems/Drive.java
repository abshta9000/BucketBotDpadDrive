// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.PortConstants;
import frc.robot.Constants.MotorConstants;;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class Drive extends SubsystemBase {
  private WPI_TalonSRX  frontright;
  private WPI_TalonSRX  frontleft;
  private WPI_TalonSRX  backright;
  private WPI_TalonSRX  backleft;

  /** Creates a new Drive. */
  public Drive() {

    frontright = new WPI_TalonSRX(PortConstants.frontrightMotorID);
    frontleft = new WPI_TalonSRX(PortConstants.frontleftMotorID);
    backright = new WPI_TalonSRX(PortConstants.backrightMotorID);
    backleft = new WPI_TalonSRX(PortConstants.backleftMotorID);

    configMotors(frontright);
    configMotors(frontleft);
    configMotors(backright);
    configMotors(backleft);
    
    backright.follow(frontright);
    backleft.follow(frontleft);

    frontleft.setInverted(true);
    backleft.setInverted(true);

  }

  public void configMotors(WPI_TalonSRX motor){
    motor.configPeakCurrentLimit(MotorConstants.drivebasePeakCurrent);
    motor.configPeakCurrentDuration(MotorConstants.drivebasePeakCurrentDuration);
  }

  public void speedSetter(double rightspeed,double leftspeed){
    frontleft.set(leftspeed);
    frontright.set(rightspeed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
