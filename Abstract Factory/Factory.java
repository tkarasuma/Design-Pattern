public abstract class Factory {
    public  static Factory  getFactory(String str){
        Factory factory = null;
        try {
            factory =(Factory)Class.forName(str).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("HogeMotorsとFugaMotorsのどちらかを選んで下さい。");
        }
        return  factory;
    }
    public abstract Car createCar(String str);
    public abstract Truck createTruck(String str);
 
}