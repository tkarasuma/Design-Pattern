public class BlackBarrierBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();
    public void makeFoundation(String str) {
        buffer.append("黒魔術の結界:"+str+"\n");
    }
    public void makePillar(String str) {
        buffer.append("黒魔術の結界:"+str+"\n");
    }
    public void makeCover(String str) {
        buffer.append("黒魔術の結界:" + str  + " "+ str + " "+ str+ "\n");
    }
    public String getResult() {
        return buffer.toString();
    }
}
