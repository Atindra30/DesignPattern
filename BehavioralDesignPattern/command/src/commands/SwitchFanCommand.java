package commands;

import commandReceiver.Fan;

public class SwitchFanCommand implements Command{

    private Fan fan;

    public SwitchFanCommand(Fan fan){
        this.fan=fan;
    }

    @Override
    public void execute() {
        fan.switchFanAtSpeed();

    }
}
