interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {

    public void takePhoto() {
        System.out.println("Photo captured using camera.");
    }

    public void playMusic() {
        System.out.println("Music is playing.");
    }
}

public class Phone {
    public static void main(String[] args) {

        SmartPhone s = new SmartPhone();

        s.takePhoto();
        s.playMusic();
    }
}