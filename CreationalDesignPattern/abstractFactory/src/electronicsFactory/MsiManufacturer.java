package electronicsFactory;

import product.gpu.Gpu;
import product.gpu.MsiGpu;
import product.monitor.Monitor;
import product.monitor.MsiMonitor;

public class MsiManufacturer extends Electronics{
    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
