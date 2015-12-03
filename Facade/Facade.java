public class Facade {
    //コンストラクターはいらないので、private指定
    private  Facade(){

    }
    public  static  void totalMethod(){
        Class_A class_A = new Class_A();
        Class_B class_B = new Class_B();
        Class_C class_C = new Class_C();
        Class_D class_D = new Class_D();

        System.out.println("###class_A.Method_A()###");
        class_A.Method_A();
        System.out.println();

        System.out.println("###class_B.Method_B_C###");
        class_B.Method_B();
        System.out.println();

        System.out.println("###class_C.Method_C_B###");
        class_C.Method_C();
        System.out.println();

        System.out.println("###class_D.Method_D()###");
        class_D.Method_D();
        System.out.println();

    }
}