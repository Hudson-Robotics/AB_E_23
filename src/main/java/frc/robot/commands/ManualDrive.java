package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSub;

public class ManualDrive extends CommandBase {
    private final DriveSub driveSub;
    private final DoubleSupplier forward;
    private final DoubleSupplier rotation;

    public ManualDrive(DriveSub driveSub, DoubleSupplier forward, DoubleSupplier rotation) {
        this.driveSub = driveSub;
        this.forward = forward;
        this.rotation = rotation;
        addRequirements(this.driveSub);
    }

    @Override
    public void execute() {
        this.driveSub.arcadeDrive(this.forward.getAsDouble(), this.rotation.getAsDouble());
    }

}
