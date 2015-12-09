public class Context{
    private State state = null;

    public Context(){
        state = StateA.getInstance();
    }

    public void setState(State state){
        this.state = state;
    }

    public void goNext(int input){
        state.goNext(this, input);
    }

}