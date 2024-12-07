package challenges.practice.robot_interface;

public class Shooter extends AbstractRobot {
    double shooterSpeed;
    double hoodAngle;

    public Shooter(String teamName, int teamNumber, double shooterSpeed, double hoodAngle) {
        super(teamName, teamNumber);
        this.shooterSpeed = shooterSpeed;
        this.hoodAngle = hoodAngle;
    }

    public double getShooterSpeed() {
        return shooterSpeed;
    }

    public void setShooterSpeed(double shooterSpeed) {
        this.shooterSpeed = shooterSpeed;
    }

    public double getHoodAngle() {
        return hoodAngle;
    }

    public void setHoodAngle(double hoodAngle) {
        this.hoodAngle = hoodAngle;
    }
}
