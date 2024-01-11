package Swing;

import javax.swing.*;
import java.awt.*;

public class xuexi {
    JFrame frame;
    JButton button;
    JPanel contentPane;

    public void init(){
        frame =new JFrame("MY JFrame");
        button=new JButton("Press me");
        contentPane =new JPanel();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(button,BorderLayout.CENTER);
        frame.setContentPane(contentPane);
        frame.setSize(300,200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        xuexi frameDem=new xuexi();
        frameDem.init();
    }
}
