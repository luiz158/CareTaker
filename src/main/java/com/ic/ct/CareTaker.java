package com.ic.ct;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by iuliana.cosmina on 12/22/14.
 */
public class CareTaker extends JFrame{

    public CareTaker() {
        System.out.println("init");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setTitle("CareTaker says ... ");

        JPanel panel = new JPanel();
        //panel.setPreferredSize(new Dimension(200, 100));
        JTextArea area = new JTextArea();
        area.setPreferredSize(new Dimension(300, 200));
        area.setLineWrap(true);
        area.setFont(new Font("Courier New", Font.BOLD, 14));
        area.setForeground(Color.RED);
        area.setText("Time to get off your chair or else you are going to get fat!!!");
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.add(area);
        getContentPane().add(panel);


        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        setLocationRelativeTo(null);

        addWindowListener(new CtWindowListener(this));
        pack();
    }


    private static class CtWindowListener implements WindowListener {
        private JFrame frame;

        CtWindowListener(JFrame frame) {
            this.frame = frame;
        }

        @Override
        public void windowOpened(WindowEvent e) {

        }

        @Override
        public void windowClosing(WindowEvent e) {
            frame.setVisible(false);
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
