package Swing;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {
    private JFrame frame;
    private JButton be, bw, bn, bs, bc;

    public static void main(String[] args) {
        BorderLayoutDemo that = new BorderLayoutDemo();
        that.go();
    }

    public void go() {
        frame = new JFrame("Border Layout");
        be = new JButton("East");
        bs = new JButton("South");
        bw = new JButton("West");
        bn = new JButton("North");
        bc = new JButton("Center");
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout(10, 10));
        contentPane.add(be, BorderLayout.EAST);
        contentPane.add(bs, BorderLayout.SOUTH);
        contentPane.add(bw, BorderLayout.WEST);
        contentPane.add(bn, BorderLayout.NORTH);
        contentPane.add(bc, BorderLayout.CENTER);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
