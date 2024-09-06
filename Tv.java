public class Tv {
    public static void main(String args[]) {
        OldTv tv1 = new OldTv();
        tv1.SwitchOn();
        tv1.SwitchOff();
        tv1.ChangeChannel();

        SmartTv tv2 = new SmartTv();
        tv2.SwitchOn();
        tv2.SwitchOff();
        tv2.ChangeChannel();
        tv2.Browse();

        OldTv tv3 = new SmartTv(); //Here, the tv3 is reference of OldTv so it can access only the methods and variables of OldTv.
        tv3.SwitchOn(); //According to Dynamic method Dispatch, the method of SmartTv will implement.
        tv3.SwitchOff();
        tv3.ChangeChannel();
        // tv3.browse(); //it will show error because browse is a method of SmartTv and tv3 is refence of OldTv, and browse method is not available in OldTv class.
    }
}

class OldTv {
    public void SwitchOn() {
        System.out.println("Tv is On");
    }

    public void SwitchOff() {
        System.out.println("Tv is Off");
    }

    public void ChangeChannel() {
        System.out.println("Channel is changed");
    }
}

class SmartTv extends OldTv {
    @Override
    public void SwitchOn() {
        System.out.println("SmartTv is On");
    }

    @Override
    public void SwitchOff() {
        System.out.println("SmartTv is Off");
    }

    @Override
    public void ChangeChannel() {
        System.out.println("Channel is changed in SmartTv");
    }

    public void Browse() {
        System.out.println("Browse mode is On");
    }
}
