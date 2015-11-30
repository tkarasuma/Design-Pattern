public class Param2_Strategy implements Strategy {
    @Override
    public void compare(Sample s1, Sample s2) {
        if (s1.param2 > s2.param2){
            System.out.println(s1 + "の勝ち!!");
        }else if(s1.param2 < s2.param2){
            System.out.println(s2 + "の勝ち!!");
        }else{
            System.out.println("引き分け");
        }
    }
}
