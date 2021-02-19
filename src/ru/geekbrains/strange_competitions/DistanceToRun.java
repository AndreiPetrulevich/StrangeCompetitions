package ru.geekbrains.strange_competitions;

public class DistanceToRun extends Obstacle{

    private int distance;

    public DistanceToRun(int distance, String name) {
        setSize(distance);
        this.name = name;
    }

    @Override
    void setSize(int size) {
        this.distance = size;
    }

    @Override
    int getSize() {
        return this.distance;
    }
}
