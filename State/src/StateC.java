public class StateC implements State{
    private static final String stateName = "C";

    private static State state = new StateC();
    private StateC(){}
    public static State getInstance(){
        return state;
    }

    public void goNext(Context context, int condition){
        switch (condition){
            case 0:
                context.setState(StateB.getInstance());
                showTransition("B");
                break;
            case 1:
                context.setState(StateA.getInstance());
                showTransition("A");
                break;
        }
    }
    public  void showTransition(String to){
        System.out.println("状態 "+stateName+" から 状態 "+to+" へ遷移");
    }

    @Override
    public String toString() {
        return this.stateName;
    }
}