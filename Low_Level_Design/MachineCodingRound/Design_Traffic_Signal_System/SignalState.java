package Low_Level_Design.MachineCodingRound.Design_Traffic_Signal_System;

public interface SignalState {
    void handle(TrafficLight light, TrafficSignalController controller, Direction direction);
    String getName();
}
