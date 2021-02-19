package ru.geekbrains.strange_competitions;

public class Wall extends Obstacle{

    private int height;

    public Wall(int height, String name) {
        setSize(height);
        this.name = name;
    }

    @Override
    void setSize(int size) {
        this.height = size;
    }

    @Override
    int getSize() {
        return this.height;
    }
}