import java.awt.*;
import java.util.Random;

public  class Player {
    private int gold;
    private Point position;
    private int experience;

    private Random random = new Random();

    public Player(int gold) {
        this.gold = gold;
        this.position = new Point(0, 0);
        this.experience = 0;
    }

    public void play() {
        this.gold += random.nextInt(10);
        this.position = new Point((int)this.position.getX()+random.nextInt(100) - 50,
                (int)this.position.getY()+random.nextInt(100) - 50);
        this.experience += random.nextInt(15);
    }

    public Memento createMemento() {
        return new Memento(gold, position, experience);
    }

    public void restoreMemento(Memento memento) {
        this.gold = memento.getGold();
        this.experience = memento.getExperience();
        this.position = memento.getPosition();
    }

    public String toString() {
        return "【  ゴールド : " + String.format("%4d",gold) + ",  経験値 : " + this.experience +
                ", 現在地の座標 : ( x = " + String.format("%4d, ", (int)position.getX()) +String.format(" y = %4d ", (int)position.getY())+ " )  】";
    }

}