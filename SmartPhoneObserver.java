package deepak.observer.raingauge;
public class SmartPhoneObserver implements Observer, DisplayPrinter{
    private RainGaugeModel rainGaugeModel;
    private double volume;
    
    public SmartPhoneObserver(RainGaugeModel rainGaugeModel){
        this.rainGaugeModel = rainGaugeModel;
        this.rainGaugeModel.attach(this);
    }
    public void update(double volume){
        this.volume = volume;
        display();
    }
    public void display(){
        System.out.println("Smartphone display Rain Gauge Measurements Changed to " + volume);
    }
}
