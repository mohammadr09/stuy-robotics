package challenges.gpt_generated.robot_subsystems;

import java.util.Scanner;

public class Shooter extends AbstractRobot {
    double shooterSpeed;
    double hoodAngle;

    public Shooter(String teamName, int teamNumber, double shooterSpeed, double hoodAngle) {
        super(teamName, teamNumber);
        this.shooterSpeed = shooterSpeed;
        this.hoodAngle = hoodAngle;
    }

    Scanner in = new Scanner(System.in);

    @Override
    public String getRobotType() {
        System.out.println("Shooter");
        return null;
    }

    public double getShooterSpeed() {
        return shooterSpeed;
    }

    public double getHoodAngle() {
        return hoodAngle;
    }

    public void setHoodAngle(double hoodAngle) {
        this.hoodAngle = hoodAngle;
    }

    public void setShooterSpeed(double shooterSpeed) {
        this.shooterSpeed = shooterSpeed;
    }

    @Override
    public void performDiagnostic() {
        System.out.println("Performing Diagnostics");
        System.out.println("Team Name: " + getTeamName());
        System.out.println("Team Number: " + getTeamNumber());
        System.out.println("----------------------");

        System.out.println("Shooter Speed: " + shooterSpeed);
        System.out.println("Hood Angle: " + hoodAngle);
        System.out.println("Are these correct? (y/n)");

        String input = in.nextLine();

        if (input == "n" || input == "no") {
            System.out.println("""
                    Input the Index of the Item that Needs to be Changed:
                    1) Shooter Speed
                    2) Hood Angle
                    """);
            
            int index = in.nextInt();

            if (index == 1) {
                System.out.println("Set Shooter Speed: ");

                int newSpeed = in.nextInt();
                setShooterSpeed(newSpeed);
                System.out.println("Shooter Speed is Set\n" + getShooterSpeed());
            } else if (index == 2) {
                System.out.println("Set Hood Abngle: ");

                int newAngle = in.nextInt();
                setHoodAngle(newAngle);
                System.out.println("Hood Angle is Set\n" + getHoodAngle());
            }
        }
    }
}