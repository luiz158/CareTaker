package com.ic;

import com.ic.ct.CareTaker;

import java.awt.*;

/**
 * Created by iuliana.cosminas on 12/22/14.
 */
public class Start {



    public static void main(String[] args) throws InterruptedException {
        if (!SystemTray.isSupported()) {
            System.out.println("System tray is not supported !!! ");
        } else {
            System.out.println("System tray is supported, thank Cheesus!!!");
            if (System.getProperty("os.name").equals("Mac OS X")) {
                System.setProperty("apple.apple.macos.useScreenMenuBar", "true");
            }
            new CareTaker();
        }
    }
}
