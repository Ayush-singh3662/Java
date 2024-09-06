public class CreatePhone {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        s.call();
        s.sms();
        s.videoCall();
        s.play();
        s.pause();
        s.stop();
        s.click();
        s.record();

        Phone p = s;
        p.call();
        p.sms();

        Camera c = s;
        c.click();
        c.record();

        MusicPlayer m = s;
        m.play();
        m.pause();
        m.stop();
    }
}

class Phone {
    void call() {
        System.out.println("Phone is calling");
    }
    void sms() {
        System.out.println("Phone is sending sms");
    }
}

interface Camera {
    void click();
    void record();
}

interface MusicPlayer {
    void play();
    void pause();
    void stop();
}

class SmartPhone extends Phone implements Camera, MusicPlayer {
    void videoCall() {
        System.out.println("SmartPhone is video calling");
    }
    
    public void click() {
        System.out.println("Photo is clicked");
    }

    public void record() {
        System.out.println("Video is start recording");
    }

    public void play() {
        System.out.println("Music starts playing");
    }

    public void pause() {
        System.out.println("Music is paused");
    }

    public void stop() {
        System.out.println("Music is stopped playing");
    }
}