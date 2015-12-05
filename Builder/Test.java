import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        String style  = null;
        while(style==null){
            style = selectStyle();
        }
        if (style.equals("1")){
            BlackBarrierBuilder builder = new BlackBarrierBuilder();
            Director director = new Director(builder);
            director.construct();
            String result = builder.getResult();
            System.out.println(result);
        }else{
            WhiteBarrierBuilder builder = new WhiteBarrierBuilder();
            Director director = new Director(builder);
            director.construct();
            String result = builder.getResult();
            System.out.println(result);
        }
    }
    public  static String selectStyle(){
        System.out.println("どちらの様式の結界にしますか？");
        System.out.println("1: 黒魔術");
        System.out.println("2: 白魔術");
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }
}
