package commands;

import commandReceiver.Light;

public class SwitchLightCommand implements Command {

    private Light light;

    public SwitchLightCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        light.switchLight();
    }
}
