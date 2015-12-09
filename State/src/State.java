public interface State{
    void goNext(Context context, int condition);
    void showTransition(String to);
}