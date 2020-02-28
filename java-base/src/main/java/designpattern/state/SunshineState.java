package designpattern.state;

public class SunshineState implements State{

    @Override
    public String getState(Context context) {
        context.setState(new RainState());
        return "晴天";
    }
}
