package ru.geekbrains.strange_competitions;

public abstract class Obstacle {
    int size;
    String name;

    abstract void setSize(int size);
    abstract int getSize();

}
