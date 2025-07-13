import java.util.ArrayList;
import java.util.List;

public class ObserverPattern {
    public static void main(String[] args) {
        WeatherObservable weatherObservable = new WeatherObservable();
        WeatherObserver laptopWeatherObserver = new WeatherObserver(weatherObservable);
        WeatherObserver phoneWeatherObserver = new WeatherObserver(weatherObservable);
        weatherObservable.add(laptopWeatherObserver);
        weatherObservable.add(phoneWeatherObserver);
        weatherObservable.setTemp(40);
    }
}
class Weather{
    private double temp;
    public Weather(){
        this.temp = 37.8;
    }
    public void setTemp(double temp){
        this.temp = temp;
    }
    public double getTemp(){
        return this.temp;
    }

}
interface ObservableInterface{
    public void notifyToObserver();
    public String observableName();
}
class WeatherObservable implements ObservableInterface{
    List<ObserverInterface> list;
    Weather weather;
    public WeatherObservable(){
        list = new ArrayList<>();
        weather = new Weather();
    }
    public void add(ObserverInterface observer){
        list.add(observer);
    }
    public void remove(ObserverInterface observer){
        list.remove(observer);
    }
    public void notifyToObserver(){
        for(ObserverInterface observer : list){
            observer.update("Weather is updated.");
        }
    }
    public void setTemp(double temp){
        weather.setTemp(temp);
        notifyToObserver();
    }
    @Override
    public String observableName() {
        return "Weather Observable";
    }
}
interface ObserverInterface{
    public void update(String message);
}
class WeatherObserver implements ObserverInterface{
    ObservableInterface observableInterface;
    public WeatherObserver(ObservableInterface observableInterface){
        this.observableInterface = observableInterface;
    }
    String message;
    public void update(String message){
        this.message = message;
        display();
    }
    public void display(){
        System.out.println("The message is - "+message);
        System.out.println(observableInterface.observableName());
    }
}