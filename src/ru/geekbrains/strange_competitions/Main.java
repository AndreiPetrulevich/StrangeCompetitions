package ru.geekbrains.strange_competitions;

public class Main {

    public static void main(String[] args) {
        makeObstacles();
        makeMembers();
        checkObstacles();
    }

    public static Obstacle[] makeObstacles() {
        Obstacle [] obstacles = new Obstacle[6];
        for (int i = 0; i < obstacles.length; i++) {
            if (i <= 3) {
                obstacles[i] = new DistanceToRun((int)(Math.random() * 40 + 1), "Distance to run " + i);
            } else {
                obstacles[i] = new Wall((int)(Math.random() * 40 + 1), "Wall" + i);
            }
        }
        return obstacles;
    }

    public static Object [] makeMembers() {
        Object [] members = new Object[6];
        for (int i = 0; i < members.length; i++) {
            if (i % 2 == 0) {
                members[i] = new Cat("Kote " + i);
            } else if (i % 2 == 1) {
                members[i] = new Human("Human " + i);
            } else {
                members[i] = new Robot("Robot " + i);
            }
        }
        return members;
    }

    public static void checkObstacles() {
        for (int i = 0; i < makeObstacles().length; i++) {
            for (int j = 0; j < makeMembers().length; j++) {
                if (makeObstacles()[i] instanceof DistanceToRun) {
                    if (makeMembers()[j] instanceof Cat) {
                        ((Cat)makeMembers()[j]).printRunInfo(makeObstacles()[i].getSize());
                    } else if (makeMembers()[j] instanceof Human) {
                        ((Human)makeMembers()[j]).printRunInfo(makeObstacles()[i].getSize());
                    } else if (makeMembers()[j] instanceof Robot){
                        ((Robot)makeMembers()[j]).printRunInfo(makeObstacles()[i].getSize());
                    }
                } else if (makeObstacles()[i] instanceof Wall) {
                    if (makeMembers()[j] instanceof Cat) {
                        ((Cat)makeMembers()[j]).printJumpInfo(makeObstacles()[i].getSize());
                    } else if (makeMembers()[j] instanceof Human) {
                        ((Human)makeMembers()[j]).printJumpInfo(makeObstacles()[i].getSize());
                    } else if (makeMembers()[j] instanceof Robot){
                        ((Robot)makeMembers()[j]).printJumpInfo(makeObstacles()[i].getSize());
                    }
                }
            }
        }
    }
}
