package com.hippodrome;

import java.util.*;

public class Hippodrome {
    private List<Horse> horses;
    private static Hippodrome game;
    private static final int DISTANCE = 100;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void move() {                                //  Вызываем метод move() у каждого коня
        for (Horse horse : horses) {
            horse.move();
        }
    }

    public void print(){                                //  Вызываем метод print() у каждого коня
        for (Horse horse : horses) {
            horse.print();
        }
        for (int i = 0; i < 10 ; i++) {
            System.out.println();
        }
    }

    public void run() {                                 // Длительность забега
        for (int i = 0; i < DISTANCE ; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            }
            catch (InterruptedException e) {
                e.getMessage();
            }
        }
    }

    public Horse getWinner() {                          // Определение победителя
        double maxDistance = 0;
        Horse winner = null;
        for (Horse horse : getHorses()) {
            if (horse.getDistance() > maxDistance) {
                maxDistance = horse.getDistance();
                winner = horse;
            }
        }
        return winner;
    }

    public void printWinner() {                         // Вывод на экран победителя
        System.out.println(getWinner().getName() + " is winner!");
    }

    public static void main(String[] args) {           //   Создаем 3 коня и добавляем в список
        game = new Hippodrome(new ArrayList<>());
//
        game.getHorses().add(new Horse("Unlucky", 3, 0));
        game.getHorses().add(new Horse("Unhappy", 3, 0));
        game.getHorses().add(new Horse("Unstoppable", 3, 0));

        game.run();
        game.printWinner();
    }
}
