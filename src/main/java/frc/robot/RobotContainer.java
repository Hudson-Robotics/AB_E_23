package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.Constants.IOConstants;
import frc.robot.subsystems.DriveSub;
import frc.robot.commands.ManualDrive;
import edu.wpi.first.wpilibj.XboxController;
import static edu.wpi.first.wpilibj.XboxController.Button;

public class RobotContainer {
  private final DriveSub wheels = new DriveSub();
  XboxController controller = new XboxController(IOConstants.kDriverControllerPort);

  public RobotContainer() {
    configureBindings();
    wheels.setDefaultCommand(
        new ManualDrive(
            wheels,
            () -> -controller.getLeftY(),
            () -> controller.getRightX()));
  }

  private void configureBindings() {
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
