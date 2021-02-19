package ru.geekbrains.strange_competitions;

public class Robot {
    private int maxDistanceToRun;
    private int maxHeightToJump;
    private String name;

    public Robot(String name) {
        this.name = name;
        this.maxDistanceToRun = (int)(Math.random() * 40 + 1);
        this.maxHeightToJump = (int)(Math.random() * 40 + 1);
    }

    public void printRunInfo(int size) {
        if (maxDistanceToRun >= size){
            System.out.println(name + " can run " + maxDistanceToRun);
        } else {
            System.out.println(name + " can't run " + maxDistanceToRun);
        }

    }

    public void printJumpInfo(int size) {
        if (maxHeightToJump >= size){
            System.out.println(name + " can run " + maxHeightToJump);
        } else {
            System.out.println(name + " can't run " + maxHeightToJump);
        }
    }
}