interface LightControl {
    void lightOn();
}

interface FanControl {
    void fanOn();
}

class SmartHome implements LightControl, FanControl {

    public void lightOn() {
        System.out.println("Light is ON.");
    }

    public void fanOn() {
        System.out.println("Fan is ON.");
    }
}

public class HomeDemo {
    public static void main(String[] args) {

        SmartHome s = new SmartHome();

        s.lightOn();
        s.fanOn();
    }
}