import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by bartu on 03/02/2018.
 */
public class Main {

    public static void main(String args[]) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of grid:");

        Grid mars = new Grid(scanner.nextInt(), scanner.nextInt());

        printForOneRobot(mars, scanner);

        if (scanner.next() == "Yes") {
            printForOneRobot(mars, scanner);
        } else {
            scanner.close(); 
        }


    }

    private static void printForOneRobot(Grid mars, Scanner scanner) {
        System.out.println("Enter starting position of new robot with spaces between characters:");

        Robot robot = new Robot(scanner.nextInt(), scanner.nextInt(), getDirection(scanner.next()), mars);

        System.out.println("Enter sequence of commands:");

        String commands = scanner.next();

        for (int i = 0; i < commands.length(); i++) {

            doCommand(robot, commands.charAt(i));
        }

        String status = robot.x + " " + robot.y + " " + robot.dir;
        if (robot.isLost()) {
            status += " LOST";
        }
        System.out.println(status);

        System.out.println("Continue? Type Y/N:");



    }

    private static void doCommand(Robot robot, char c) {

        switch (c) {
            case 'F':
                robot.moveForward();
                break;
            case 'L':
                robot.turnLeft();
                break;
            case 'R':
                robot.turnRight();
                break;
        }
    }

    public static Direction getDirection(String c) {

        switch (c) {
            case "N":
                return Direction.N;
            case "E":
                return Direction.E;
            case "S":
                return Direction.S;
            case "W":
                return Direction.W;
            default:
                return Direction.N;
        }
    }
}
