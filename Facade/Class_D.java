public class Class_D {
    public void Method_D(){
        System.out.println("<Class_D#Method_D>");
        Method_D_C();
        System.out.println("</Class_D#Method_D>");
    }

    public void Method_D_C(){
        System.out.println("<Method_D_C>");
        new Class_C().Method_C2();
        System.out.println( "</Method_D_C>");
    }
}