package deepak.observer.raingauge;


public class WebClientObserver implements Observer, DisplayPrinter{
    private RainGaugeModel rainGaugeModel;
    private double volume;
    
    public WebClientObserver(RainGaugeModel rainGaugeModel){
        this.rainGaugeModel = rainGaugeModel;
        this.rainGaugeModel.attach(this);
    }
    public void update(double volume){
        this.volume = volume;
        display();
    }
    public void display(){
        System.out.println("WebClient display Rain Gauge Measurements Changed to " + volume);
    }
}
