package challenges.practice.robot_interface;

public class AbstractRobot implements Robot {
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
}
