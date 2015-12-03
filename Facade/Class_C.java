public class Class_C {
    public void Method_C(){
        System.out.println( "<Class_C#Method_C>");
        Method_C_B();
        System.out.println( "</Class_C#Method_C>");
    }
    public void Method_C2(){
        System.out.println( "<Class_C#Method_C2>");
        System.out.println( "</Class_C#Method_C2>");
    }
    public void Method_C_B(){
        System.out.println("<Method_C_B>");
        new Class_B().Method_B2();
        System.out.println("</Method_C_B>");
    }
}