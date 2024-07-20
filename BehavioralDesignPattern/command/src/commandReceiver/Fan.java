package commandReceiver;

public class Fan {

    private int speed;
    private boolean isStarted;

    public Fan(){

    }

    public Fan(int speed){
        this.speed=speed;
    }


    public void switchFanAtSpeed(){

        this.isStarted=!isStarted;
        System.out.println("Fan at speed "+speed+" and is started "+isStarted);
    }

}
