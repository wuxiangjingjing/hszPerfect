package designpattern.state;

public class RainState implements State {
    @Override
    public String getState(Context context) {
        context.setState(new SunshineState());
        return "下雨";
    }
}
