public class Class_A {
    public void Method_A(){
        System.out.println("<Class_A#Method_A>");
        Method_A_B();
        System.out.println("</Class_A#Method_A>");
    }

    public void Method_A_B(){
        System.out.println("<Class_A#Method_A_B>");
        new Class_B().Method_B2();
        System.out.println("</Class_A#Method_A_B>");
    }
}