package deepak.observer.raingauge;


public interface Subject {
    public void attach(Observer observer);
    public void remove(Observer observer);
    public void notifyAllObservers();
}
