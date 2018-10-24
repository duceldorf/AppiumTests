package AppiumPackage;

import devices.meizuM6s;

public class Configurator {
    public String device;

    public String deviceName;
    public String platformName;
    public String platformVersion;
    public String udid;

    public Configurator(String device){
        switch (device) {

            case "meizuM6s":
                meizuM6s m6s = new meizuM6s();
                this.deviceName = m6s.deviceName;
                this.platformName = m6s.platformName;
                this.platformVersion = m6s.platformVersion;
                this.udid = m6s.udid;
                break;


        }
    }
}
