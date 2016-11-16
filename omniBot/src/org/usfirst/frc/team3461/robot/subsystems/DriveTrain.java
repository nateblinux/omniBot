
package org.usfirst.frc.team3461.robot.subsystems;

import org.usfirst.frc.team3461.robot.commands.Drive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
	RobotDrive drive = new RobotDrive(0,1);
	
	public DriveTrain(){
		super("drivetrain");
	}
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	setDefaultCommand(new Drive());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void arcadeDrive(double rotate, double speed){
    	drive.arcadeDrive(rotate, speed);
    }
}

