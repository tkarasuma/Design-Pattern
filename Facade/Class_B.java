public class Class_B {
    public void Method_B(){
        System.out.println( "<Class_B#Method_B>");
        Method_B_C();
        System.out.println( "</Class_B#Method_B>");
    }
    public void Method_B2(){
        System.out.println( "<Class_B#Method_B2>");
        System.out.println( "</Class_B#Method_B2>");
    }
    public void Method_B_C(){
        System.out.println("<Class_B#Method_B_C>");
        new Class_C().Method_C2();
        System.out.println("</Class_B#Method_B_C>");
    }
}