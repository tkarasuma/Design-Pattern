public class Sample {
    public String name;
    public  int param1;
    public  int param2;
    public  int param3;

    public Sample(String name, int param1, int param2, int param3) {
        this.name = name;
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
    }

    @Override
    public String toString() {
        return "Sampleクラス{" +
                "name='" + name + '\'' +
                '}';
    }
}
