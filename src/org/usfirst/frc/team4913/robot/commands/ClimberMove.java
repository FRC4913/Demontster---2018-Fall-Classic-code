package org.usfirst.frc.team4913.robot.commands;

import static org.usfirst.frc.team4913.robot.OI.xboxController;
import static org.usfirst.frc.team4913.robot.Robot.climber;

import org.usfirst.frc.team4913.robot.RobotMap;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ClimberMove extends Command {
	
	
	public ClimberMove() {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		super("ClimberMove");
		requires(climber);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		climber.move(-xboxController.getY(Hand.kRight));
//		System.out.println("count: " + enc.get());
//		System.out.println("distance: " + enc.getDistance());
//		System.out.println("direction: " + enc.getDirection());
//		System.out.println("raw: " + enc.getRaw());
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
		climber.stop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		end();
	}
}
