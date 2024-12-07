package challenges.gpt_generated.robot_subsystems;

import java.util.Scanner;

public class Drivetrain extends AbstractRobot {
    Scanner in = new Scanner(System.in);

    double wheelSpeed;
    double heading;

    public Drivetrain(String teamName, int teamNumber, double wheelSpeed, double heading) {
        super(teamName, teamNumber);
        this.wheelSpeed = wheelSpeed;
        this.heading = heading;
    }

    @Override
    public String getRobotType() {
        System.out.println("Drivetrain");
        return null;
    }

    public void setWheelSpeed(double wheelSpeed) {
        this.wheelSpeed = wheelSpeed;
    }

    public void setHeading(double heading) {
        this.heading = heading;
    }

    public double getWheelSpeed() {
        return wheelSpeed;
    }

    public double getHeading() {
        return heading;
    }

    @Override
    public void performDiagnostic() {
        System.out.println("Performing Diagnostics");
        System.out.println("Team Name: " + getTeamName());
        System.out.println("Team Number: " + getTeamNumber());
        System.out.println("----------------------");

        System.out.println("Shooter Speed: " + wheelSpeed);
        System.out.println("Hood Angle: " + heading);
        System.out.println("Are these correct? (y/n)");

        String input = in.nextLine();

        if (input == "n" || input == "no") {
            System.out.println("""
                    Input the Index of the Item that Needs to be Changed:
                    1) Wheel Speed
                    2) Headig Angle
                    """);
            
            int index = in.nextInt();

            if (index == 1) {
                System.out.println("Set Wheel Speed: ");

                int newSpeed = in.nextInt();
                setWheelSpeed(newSpeed);
                System.out.println("Shooter Speed is Set\n" + getWheelSpeed());
            } else if (index == 2) {
                System.out.println("Set Heading Abngle: ");

                int newAngle = in.nextInt();
                setHeading(newAngle);
                System.out.println("Hood Angle is Set\n" + getHeading());
            }
        }
    }
}
