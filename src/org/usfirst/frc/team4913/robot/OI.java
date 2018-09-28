/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4913.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team4913.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);
	public static XboxController xboxController = new XboxController(RobotMap.XBOX_CONTROLLER_PORT);
	
	
	//B & X used for grabber. B for oPening (say it in your head) and X for cloSing
	public Button GrabberOpen = new JoystickButton(xboxController, 2);//open grabber
	public Button GrabberClose = new JoystickButton(xboxController, 3);//close grabber
	
	
	//Y & A used for rotator. Y is for raising, A for lowering. Makes sense because Y is above A
	public Button RotatorUp = new JoystickButton(xboxController, 4);//raise rotator. It's above button A
	public Button RotatorDown = new JoystickButton(xboxController, 1);//lowers rotator. Below button Y, so

	
	public Button ArmUp = new JoystickButton(xboxController, 8);//Start button to raise
	public Button ArmDown = new JoystickButton(xboxController, 7);//Back button to lower
	
	
	
	// left and right bumpers
	public Button ArmKeepLB = new JoystickButton(xboxController, 5);


	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Bu	tton.

	public OI() {
		GrabberOpen.whileHeld(new GrabberOpen());
		GrabberClose.whileHeld(new GrabberClose());
		
		RotatorUp.whileHeld(new RotatorUp());
		RotatorDown.whileHeld(new RotatorDown());
		
		ArmKeepLB.whenPressed(new MaintainHeight());
		
		ArmUp.whileHeld(new ArmUp());
		ArmDown.whileHeld(new ArmDown());
		
		
		
		/*
		 * xboxButton5.toggleWhenActive(new BlockIntake());
		 * xboxButton6.toggleWhenActive(new BlockIntake());
		 */
	}

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// xButton.whenPressed(new GrabBlock());
	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
