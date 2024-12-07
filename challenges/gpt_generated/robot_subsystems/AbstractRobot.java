package challenges.gpt_generated.robot_subsystems;

public abstract class AbstractRobot implements RobotInterface {
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

    public abstract String getRobotType();
}
