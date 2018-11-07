package org.usfirst.frc.team4913.robot.subsystems;

import org.usfirst.frc.team4913.robot.RobotMap;
import org.usfirst.frc.team4913.robot.commands.ClimberMove;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Rotator extends Subsystem {
	///////// Rotator requires a motorController with an encoder

	// Put methods for controlling this subsystem
	// here. Call these from Commands.
//	public static double ROTATE_INWARD_SPEED = -0.01;
//	public static double ROTATE_OUTWARD_SPEED = 0.01;

	WPI_TalonSRX rotatorMotor = new WPI_TalonSRX(RobotMap.ROTATOR_MOTOR_ID);

	public static double ROTATOR_UP_SPEED = -0.85;
	public static double ROTATOR_DOWN_SPEED = 0.35;
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		
//		rotatorMotor.set(ControlMode.Position, 1.0);
//		rotatorMotor.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
		

		
	}

	
	public void up() {
		rotatorMotor.set(ROTATOR_UP_SPEED);
	}
	
	public void down() {
		rotatorMotor.set(ROTATOR_DOWN_SPEED);
	}

	public void stop() {
		rotatorMotor.set(0);
	}
}