package chapter07.readOneTimes;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Practice7_28 {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.addWindowListener(new EventHandler());
    }
}

class EventHandler extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent e) {
        e.getWindow().setVisible(false);
        e.getWindow().dispose();
        System.exit(0);
    }
}
