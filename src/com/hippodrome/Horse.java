package com.hippodrome;

public class Horse {
    private String name;
    private double speed;
    private double distance;

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void move(){                          // Получаем пройденную дистанцию коня
        distance += speed*Math.random();
    }
    public void print() {                        // Графическое изображение дистанции
        double a = Math.floor(getDistance());
        for (int i = 0; i < a ; i++) {
            System.out.print(".");
        }
        System.out.print(getName());
        System.out.println();
    }
}
