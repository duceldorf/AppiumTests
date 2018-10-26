package Helpers;

import AppiumPackage.Activitys;
import AppiumPackage.Configurator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import Helpers.ObjectsHelper;

import java.net.MalformedURLException;
import java.net.URL;

public class GlobalHelper {
    private AndroidDriver driver;
    private Activitys atv;

    private ObjectsHelper ohp;

    public void init() {

        try {

            driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),
                    new CapabilitiesManager(apkData).getCapabilities(new Configurator("meizuM6s"))); //xiaomi //meizu

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
