package deepak.observer.raingauge;


public class RainGaugeMain {


    public static void main(String args[]) {
        RainGaugeModel rainModel = new RainGaugeModel();
        
        WebClientObserver web = new WebClientObserver(rainModel);
        SmartPhoneObserver smart = new SmartPhoneObserver(rainModel);
        DesktopClientObserver desktop = new DesktopClientObserver(rainModel);
        
        System.out.println("\nRain Measurement Changed\n");
        rainModel.setVolume(34.33);
        
        System.out.println("\nRain Measurement Changed\n");
        rainModel.setVolume(10.01);
        
        System.out.println("\nRain Measurement Changed\n");
        
        rainModel.remove(desktop);
        
        rainModel.setVolume(20.54);
        
    }
}
