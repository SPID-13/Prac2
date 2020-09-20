package ru.mirea.lab2;

public class TestBall {
    public static void main (String[] args) {
        Ball b1 = new Ball (50, 50);
        Ball b2 = new Ball ();
        b2.setX (30);
        b2.setY (30);
        System.out.println (b1.ToString());
        System.out.println (b2.ToString());
        b1.move (10, 25);
        System.out.println (b1.ToString());
        System.out.println (b2.ToString());
    }
}
