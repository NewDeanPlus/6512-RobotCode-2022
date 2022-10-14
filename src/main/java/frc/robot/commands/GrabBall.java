// RobotBuilder Version: 4.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

// ROBOTBUILDER TYPE: InstantCommand.

package frc.robot.commands;
import frc.robot.subsystems.Intake;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class GrabBall extends CommandBase {
        // VARIABLE_DECLARATIONS
        private final Intake m_intake;
        // VARIABLE_DECLARATIONS
        // CONSTRUCTORS
    public GrabBall(Intake subsystem) {
        // CONSTRUCTORS
        // VARIABLE_SETTING
        // VARIABLE_SETTING
        // REQUIRES
        m_intake = subsystem;
        addRequirements(m_intake);
        // REQUIRES
    }

    // Called once when this command runs
    @Override
    public void initialize() {
    }

    public void execute(){
        m_intake.grab(.6);
    }

    @Override
    public boolean runsWhenDisabled() {
        // DISABLED
        return false;
        // DISABLED
    }
    
    public void end(boolean Interrupted){
        m_intake.stopGrab();
    }
}