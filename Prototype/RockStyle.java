import framework.*;

public class RockStyle implements Prototype {
    private char block;
    private int repeat;
    public RockStyle(char block, int repeat) {
        this.block = block;
        this.repeat = repeat;
    }
    public void run(String str) {
        int length = str.length();

        System.out.println("");
        makeWall(length,repeat );
        System.out.println( str );
        makeWall(length,repeat );
        System.out.println("");
    }

    public  void makeWall(int length, int repeat){
        for (int i = 0; i < repeat; i++) {
            for (int j = 0; j < length; j++) {
                    System.out.print(block);
            }
            System.out.println();
        }
    }

    public Prototype createClone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}
