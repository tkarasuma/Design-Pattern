public class Param1_Strategy implements Strategy {
    @Override
    public void compare(Sample s1, Sample s2) {
        if (s1.param1 > s2.param1){
            System.out.println(s1 + "の勝ち!!");
        }else if(s1.param1 < s2.param1){
            System.out.println(s2 + "の勝ち!!");
        }else{
            System.out.println("引き分け");
        }
    }
}
