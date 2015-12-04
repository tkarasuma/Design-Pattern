public class NumberBody {
    private  int number;
    public NumberBody(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    @Override
    public String toString() {
        return "NumberBody{ number=" + number +  '}';
    }
}
