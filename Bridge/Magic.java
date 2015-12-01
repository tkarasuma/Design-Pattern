public class Magic {
    MagicImpl magic;
    public Magic(MagicImpl magic) {
        this.magic = magic;
    }
    public  void magicalMethod(){
        this.magic.magicalMethodImpl();
    }
}
