package deepak.observer.raingauge;

import java.util.*;

public class RainGaugeModel implements Subject {
    private List<Observer> observers;
    private double volume;
    
    public RainGaugeModel(){
        observers = new ArrayList<Observer>();
    }
    
    public void attach(Observer observer){
        if(observer == null) throw new NullPointerException("Null Observer");
        
        if(!observers.contains(observer))
            observers.add(observer);
    }
    public void remove(Observer observer){
        if(observers.contains(observer))
            observers.remove(observer);
    }
    public void notifyAllObservers(){
        for (Observer observer : observers){
            observer.update(volume);
        }
    }
    public void measurementsChanged(){
        notifyAllObservers();
    }
    public void setVolume(double volume){
        this.volume = volume;
        measurementsChanged();
    }
}
