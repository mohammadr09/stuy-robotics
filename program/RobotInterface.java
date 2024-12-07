// OOP Lesson 2: Interface

package program;

import challenges.practice.robot_interface.*;

public class RobotInterface {
    public static void main(String[] args) {
        Shooter shooter1 = new Shooter("StuyPulse", 694, 15.0, 23.2);

        // Accessing the AbstractRobot (parent) class
        System.out.println(shooter1.getTeamName());
        System.out.println(shooter1.getTeamNumber());

        // Accessing the Shooter (child) class
        System.out.println(shooter1.getHoodAngle());
        System.out.println(shooter1.getShooterSpeed());

        shooter1.setHoodAngle(50.2);
        shooter1.setShooterSpeed(30);

        System.out.println(shooter1.getHoodAngle());
        System.out.println(shooter1.getShooterSpeed());
    }
}
