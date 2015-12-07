import framework.*;

public class PillarStyle implements Prototype {
    private char block;
    private int repeat;

    public PillarStyle(char block, int repeat) {
        this.block = block;
        this.repeat = repeat;
    }
    public void run(String str) {
        int length = str.length();

        makePillars(length, repeat);
        System.out.println(str);
        makePillars(length, repeat);

        System.out.println();
    }

    public  void makePillars(int length, int repeat){
        for (int i = 0; i < repeat; i++) {
            for (int j = 0; j < length; j++) {
                if (j==0 || j  == length-1){
                    System.out.print(block);
                }else{
                    System.out.print("　");
                }
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
