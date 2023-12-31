// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class FlywheelSusbystem extends SubsystemBase {
  /** Creates a new FlywheelSusbystem. */
  private static CANSparkMax flywheelMotor;
  private PIDController pController;

  public FlywheelSusbystem() {
    flywheelMotor = new CANSparkMax(3,MotorType.kBrushless);

    

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
