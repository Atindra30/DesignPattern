package electronicsFactory;

import product.gpu.Gpu;
import product.monitor.Monitor;

public abstract class Electronics {

    public Gpu orderGpu(){
        Gpu gpu=createGpu();
        gpu.assemble();
        return gpu;
    }

    public Monitor orderMonitor(){
        Monitor monitor=createMonitor();
        monitor.assemble();
        return monitor;
    }


    public abstract Gpu createGpu();

    public abstract Monitor createMonitor();


}
