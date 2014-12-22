package com.ic.ct;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by iuliana.cosmina on 12/22/14.
 */
public class CareTaker extends JFrame {

    //development value
    //public static int intervalSize =  2000;
    //running value
    public static int intervalSize = 2_700_000;

    public CareTaker() {
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setTitle("CareTaker says ... ");

        JPanel panel = new JPanel();
        JTextArea area = new JTextArea();
        area.setPreferredSize(new Dimension(300, 200));
        area.setLineWrap(true);
        area.setFont(new Font("Courier New", Font.BOLD, 16));
        area.setForeground(Color.RED);
        area.setText("Time to get off your chair or else you are going to get fat!\n   And drink some water while you are at it.");
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.add(area);
        getContentPane().add(panel);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        setLocationRelativeTo(null);

        addWindowListener(new CtWindowListener(this));
        setAlwaysOnTop(true);
        setLocationByPlatform(true);
        pack();
        doHide();
    }

    public void doShow(){
       setVisible(true);
    }

    public void doHide(){
        setVisible(false);
        try {
            Thread.sleep(intervalSize);
            doShow();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static class CtWindowListener implements WindowListener {
        private CareTaker ct;

        CtWindowListener(CareTaker ct) {
            this.ct = ct;
        }

        @Override
        public void windowOpened(WindowEvent e) {

        }

        @Override
        public void windowClosing(WindowEvent e) {
            ct.doHide();
        }

        @Override
        public void windowClosed(WindowEvent e) {

        }

        @Override
        public void windowIconified(WindowEvent e) {

        }

        @Override
        public void windowDeiconified(WindowEvent e) {

        }

        @Override
        public void windowActivated(WindowEvent e) {

        }

        @Override
        public void windowDeactivated(WindowEvent e) {

        }
    }
}
