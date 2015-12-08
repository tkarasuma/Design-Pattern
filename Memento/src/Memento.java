import java.awt.*;

public  class Memento {
    private int gold;
    private Point position;
    private int experience;

    public int getGold() {
        return gold;
    }

    public Point getPosition() {
        return position;
    }

    public int getExperience() {
        return experience;
    }

    public Memento(int gold, Point position, int experience) {
        this.gold = gold;
        this.position = position;
        this.experience = experience;
    }
}