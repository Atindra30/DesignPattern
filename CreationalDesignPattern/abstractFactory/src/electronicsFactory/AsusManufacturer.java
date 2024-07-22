package electronicsFactory;

import product.gpu.AsusGpu;
import product.gpu.Gpu;
import product.monitor.AsusMonitor;
import product.monitor.Monitor;

public class AsusManufacturer extends Electronics {
    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
