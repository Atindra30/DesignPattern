import electronicsFactory.AsusManufacturer;
import electronicsFactory.Electronics;
import electronicsFactory.MsiManufacturer;
import product.monitor.Monitor;
import product.monitor.MsiMonitor;

public class Main {
    public static void main(String[] args) {

        Electronics msiManufacturer=new MsiManufacturer();
        msiManufacturer.orderMonitor();
        msiManufacturer.orderGpu();

        Electronics asusManufacturer=new AsusManufacturer();
        asusManufacturer.orderMonitor();
        asusManufacturer.orderGpu();
    }
}