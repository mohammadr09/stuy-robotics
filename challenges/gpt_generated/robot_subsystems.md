# Problem: Robot with Multiple Subsystems (file: robot_subsystems)

	1.	Define a Robot interface:
        •	Include methods to get the robot’s team name and team number.
        •	Add a method void performDiagnostic() to be implemented by subclasses.
	2.	Create an AbstractRobot class:
        •	Implement the Robot interface.
        •	Include fields for the team name and team number with appropriate getters.
        •	Add an abstract method String getRobotType() that subclasses must implement.
	3.	Create a Shooter class:
        •	Extend AbstractRobot.
        •	Add fields for:
        •	Shooter speed.
        •	Hood angle.
        •	Implement the abstract methods getRobotType and performDiagnostic. In performDiagnostic, simulate a shooter diagnostic (e.g., print a message with current shooter parameters).
	4.	Create a Drivetrain class:
        •	Extend AbstractRobot.
        •	Add fields for:
        •	Wheel speed.
        •	Direction (angle in degrees).
        •	Implement getRobotType and performDiagnostic. In performDiagnostic, simulate a drivetrain diagnostic.
	5.	Create a Main class:
	    •	Create an array or list of Robot objects containing instances of both Shooter and Drivetrain.
	    •	Use a loop to call performDiagnostic on each robot, demonstrating polymorphism.
	    •	Access unique fields of each robot type within the loop by checking the class type using instanceof.

Tips/Hints:

	1.	Polymorphism:
	•	Use the Robot interface or AbstractRobot reference types in your array/list to store objects of different subclasses (Shooter and Drivetrain).
	•	When iterating through the list, you can call performDiagnostic without needing to know the exact subclass type at compile time.
	2.	instanceof and Type Casting:
	•	If you need to access fields unique to a subclass, use instanceof to check the object type and cast it to the appropriate subclass.
	3.	Abstract Method:
	•	getRobotType enforces that every subclass provides its own unique implementation, ensuring consistent usage.
	4.	Diagnostics Simulation:
	•	Make the diagnostics output useful by including the values of the subsystem-specific fields.

Solution:

1. Robot Interface:

public interface Robot {
    String getTeamName();
    int getTeamNumber();
    void performDiagnostic(); // Perform diagnostics
}

2. AbstractRobot Class:

public abstract class AbstractRobot implements Robot {
    private String teamName;
    private int teamNumber;

    public AbstractRobot(String teamName, int teamNumber) {
        this.teamName = teamName;
        this.teamNumber = teamNumber;
    }

    @Override
    public String getTeamName() {
        return teamName;
    }

    @Override
    public int getTeamNumber() {
        return teamNumber;
    }

    public abstract String getRobotType(); // Abstract method to enforce robot type implementation
}

3. Shooter Class:

public class Shooter extends AbstractRobot {
    private double shooterSpeed;
    private double hoodAngle;

    public Shooter(String teamName, int teamNumber, double shooterSpeed, double hoodAngle) {
        super(teamName, teamNumber);
        this.shooterSpeed = shooterSpeed;
        this.hoodAngle = hoodAngle;
    }

    @Override
    public String getRobotType() {
        return "Shooter";
    }

    @Override
    public void performDiagnostic() {
        System.out.println("Performing Shooter Diagnostic...");
        System.out.println("Shooter Speed: " + shooterSpeed);
        System.out.println("Hood Angle: " + hoodAngle);
    }
}

4. Drivetrain Class:

public class Drivetrain extends AbstractRobot {
    private double wheelSpeed;
    private double direction;

    public Drivetrain(String teamName, int teamNumber, double wheelSpeed, double direction) {
        super(teamName, teamNumber);
        this.wheelSpeed = wheelSpeed;
        this.direction = direction;
    }

    @Override
    public String getRobotType() {
        return "Drivetrain";
    }

    @Override
    public void performDiagnostic() {
        System.out.println("Performing Drivetrain Diagnostic...");
        System.out.println("Wheel Speed: " + wheelSpeed);
        System.out.println("Direction: " + direction + " degrees");
    }
}

5. Main Class:

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create robots
        Shooter shooter = new Shooter("Robo Warriors", 1234, 5000.0, 45.0);
        Drivetrain drivetrain = new Drivetrain("Steel Titans", 5678, 100.0, 90.0);

        // Add robots to a list
        List<Robot> robots = new ArrayList<>();
        robots.add(shooter);
        robots.add(drivetrain);

        // Perform diagnostics on all robots
        for (Robot robot : robots) {
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

Expected Output:

Team: Robo Warriors
Type: Shooter
Performing Shooter Diagnostic...
Shooter Speed: 5000.0
Hood Angle: 45.0
Shooter-specific Field - Speed: 5000.0

Team: Steel Titans
Type: Drivetrain
Performing Drivetrain Diagnostic...
Wheel Speed: 100.0
Direction: 90.0 degrees
Drivetrain-specific Field - Wheel Speed: 100.0

Key Concepts in Action:

	1.	Polymorphism: performDiagnostic is called on Robot references.
	2.	Abstract Methods: getRobotType ensures subclasses define a type.
	3.	Encapsulation: Fields are private with getters and setters.
	4.	Type Casting: instanceof is used to access subclass-specific fields.