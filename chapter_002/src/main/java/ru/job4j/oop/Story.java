package ru.job4j.oop;

public class Story {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();

        ball.met(hare);
        hare.tryEat(ball);
        ball.gone();
        ball.met(wolf);
        wolf.tryEat(ball);
        ball.gone();
        ball.met(fox);
        fox.tryEat(ball);
        ball.wasEaten();
    }
}