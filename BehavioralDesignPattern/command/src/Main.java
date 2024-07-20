import commandInvoker.LivingRoom;
import commandInvoker.Room;
import commandReceiver.Fan;
import commandReceiver.Light;
import commands.SwitchFanCommand;
import commands.SwitchLightCommand;

public class Main {
    public static void main(String[] args) {

        Room livingRoom=new LivingRoom();
        livingRoom.setCommand(new SwitchLightCommand(new Light()));
        livingRoom.executeCommand();

        livingRoom.setCommand(new SwitchFanCommand(new Fan(4)));
        livingRoom.executeCommand();
        livingRoom.executeCommand();

    }
}