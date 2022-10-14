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

import edu.wpi.first.wpilibj.Timer;

//import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;
import frc.robot.RobotContainer;
import frc.robot.Constants.IntakeConstants; 
/**
 *
 */
public class winchUpB extends CommandBase {

    // VARIABLE_DECLARATIONS
        private final Intake m_intake;
        double armMotorSpeed2=IntakeConstants.armMotorSpeed;
        public double latestUpdateUp;
        //Timer mUpTimer = new Timer();
        /*double encoderValue;
        double winchSpeed = 0.8;
        CANSparkMax winchUpMotor;*/
    // VARIABLE_DECLARATIONS
//private JoystickButton b2;
    // CONSTRUCTORS


    public winchUpB(Intake subsystem) {


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
        //mUpTimer.reset();
        //mUpTimer.start(); 
            //CANSparkMax winchUpMotor=m_intake.getWinchMotor(); //get winchMotor to set Soft Limits
                //Soft limits, should negate need for limit switch on winch. Make sure to test
                //Set the soft limit based on position. The default unit is rotations, but will match the unit scaling set by the user.
                //https://github.com/REVrobotics/SPARK-MAX-Examples/blob/master/Java/Soft%20Limits/src/main/java/frc/robot/Robot.java

                /*winchUpMotor.enableSoftLimit(CANSparkMax.SoftLimitDirection.kForward, true);
                winchUpMotor.enableSoftLimit(CANSparkMax.SoftLimitDirection.kReverse, true);

                winchUpMotor.setSoftLimit(CANSparkMax.SoftLimitDirection.kForward, (float)80.0); //was 15, should not stop at .15 of rotation
                winchUpMotor.setSoftLimit(CANSparkMax.SoftLimitDirection.kReverse, (float)0.0); //may need to increase slightly*/
    }
    public void execute(){
        /*encoderValue=m_intake.getEncoder();
        if(encoderValue>0.2 && encoderValue<0.2){
            winchSpeed=0.6;
        }else if(encoderValue>.4){
            winchSpeed=0.2;
        }else if(encoderValue==0){
            winchSpeed=0.8;
        }else{}
        m_intake.setWinchSpeed(winchSpeed);
        //m_intake.winchUp();*/
        /*if(mUpTimer.get()>6){
            m_intake.winchUp(0);
        }else{
            m_intake.winchUp(1);
        }*/
        m_intake.winchUp(armMotorSpeed2);
        /*if(RobotContainer.getXboxControllerFunct().getRawButtonPressed()==true)
        if(Timer.getFPGATimestamp()-latestUpdateUp<3){ //3 is number of secs until motor just stops while moving up  
         } */


        
    }
    @Override
    public boolean runsWhenDisabled() {
        // DISABLED
        return false;
        //if(winchMotor)

        // DISABLED
    }
    public void end(boolean Interrupted){
    }    }

