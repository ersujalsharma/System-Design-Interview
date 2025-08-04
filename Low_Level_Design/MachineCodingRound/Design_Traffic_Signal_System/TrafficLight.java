package Low_Level_Design.MachineCodingRound.Design_Traffic_Signal_System;

public class TrafficLight {
    private SignalState state;
    private final Direction direction;
    public TrafficLight(Direction direction){
        this.direction = direction;
        this.state = new RedState();
    }
    public SignalState getState() {
        return state;
    }
    public void setState(SignalState state) {
        this.state = state;
    }
    public Direction getDirection() {
        return direction;
    }
     public void handle(TrafficSignalController controller) {
        state.handle(this, controller, direction);
    }
}
