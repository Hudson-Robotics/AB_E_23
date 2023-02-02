package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX; 

public class DriveSub extends SubsystemBase {
    private final TalonSRX  leftMotor= new TalonSRX(13);
    private final TalonSRX  rightMotor= new TalonSRX(14);
 
    public DriveSub() {
       
    }

    public void arcadeDrive(double fwd, double rot){
        leftMotor.set(ControlMode.PercentOutput,fwd);
        rightMotor.set(ControlMode.PercentOutput, rot);
    }
}