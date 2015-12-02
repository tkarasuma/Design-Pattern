public class NinjaSentai {
    private  Ninja[] sentai;

    public NinjaSentai(String[] name_array) {
        sentai = new Ninja[name_array.length];
        NinjaFactory factory = NinjaFactory.getInstance();
        for (int i = 0; i < sentai.length; i++) {
            sentai[i] = factory.getNinja(name_array[i]);
        }
    }
    public  void display(){
        for (int i = 0; i < sentai.length; i++) {
            sentai[i].display();
        }
    }
}
