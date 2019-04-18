package main.java.HomeWork.hw10.Robot;

public class Robot {

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        boolean isMoved = false;
        for (int i = 0; i < 3 && !isMoved; i++) {
            try (RobotConnection robotConnection = (RobotConnection) robotConnectionManager.getConnection()) {
                robotConnection.moveRobotTo(toX, toY);
                isMoved = true;
            } catch (RobotConnectionException e) {
                System.out.println("Connection " + (i + 1) + " failed, please try again");
            }
        }
        if (!isMoved) {
            throw new RobotConnectionException("Connection failed 3 times :(");
        }
    }
}
