public class StateB implements State{
    private static final String stateName = "B";

    private static State state = new StateB();
    private StateB(){}

    public static State getInstance(){
        return state;
    }

    public void goNext(Context context, int condition){
        switch (condition){
            case 0:
                context.setState(StateA.getInstance());
                showTransition("A");
                break;
            case 1:
                context.setState(StateC.getInstance());
                showTransition("C");
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