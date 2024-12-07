package challenges.gpt_generated.robot_subsystems;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create robots
        Shooter shooter = new Shooter("Robo Warriors", 1234, 5000.0, 45.0);
        Drivetrain drivetrain = new Drivetrain("Steel Titans", 5678, 100.0, 90.0);

        // Add robots to a list
        List<RobotInterface> robots = new ArrayList<>();
        robots.add(shooter);
        robots.add(drivetrain);

        // Perform diagnostics on all robots
        for (RobotInterface robot : robots) {
            System.out.println("\nTeam: " + robot.getTeamName());
            System.out.println("Type: " + ((AbstractRobot) robot).getRobotType());
            robot.performDiagnostic();

            // Access unique fields
            if (robot instanceof Shooter) {
                Shooter s = (Shooter) robot;
                System.out.println("Shooter-specific Field - Speed: " + s.getShooterSpeed());
            } else if (robot instanceof Drivetrain) {
                Drivetrain d = (Drivetrain) robot;
                System.out.println("Drivetrain-specific Field - Wheel Speed: " + d.getWheelSpeed());
            }
        }
    }
}
