package org.usfirst.frc.team4913.robot.subsystems;

import org.usfirst.frc.team4913.robot.RobotMap;
import org.usfirst.frc.team4913.robot.commands.GrabberOpen;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Grabber extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	Spark grabberMotor = new Spark(RobotMap.GRABBER_MOTOR_PORT); //0 is a placeholder 
	DigitalInput grabberSwitch = new DigitalInput(2);
	//Limit switch is Normally Closed, so unpressed returns True, pressed returns False
	//True is unpressed, False is pressed
	public static double CLOSE_SPEEDCONSTANT = 0.2; // IN
	public static double OPEN_SPEEDCONSTANT = - 0.2; // OUT
	public static double STOP_SPEEDCONSTANT = 0.0;

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		setDefaultCommand(new GrabberOpen());
	}

	public void close() {
		if(grabberSwitch.get() == true) //limit switch is not pressed
			grabberMotor.set(CLOSE_SPEEDCONSTANT);
		else //limit switch is pressed
			grabberMotor.set(STOP_SPEEDCONSTANT);
	}

	public void open() {
		if(grabberSwitch.get() == false) //limit switch is pressed
			grabberMotor.set(STOP_SPEEDCONSTANT);
		else //limit switch is unpressed
			grabberMotor.set(OPEN_SPEEDCONSTANT);
		 
	}

	public void stop() {
		grabberMotor.set(STOP_SPEEDCONSTANT);
	}
}
