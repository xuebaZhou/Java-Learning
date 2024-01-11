package Swing;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {
    private JFrame frame;
//    定义一个JFrame容器头例frame
    private JButton button1, button2, button3;
//  定义三个JButton
    public static void main(String[] args) {
        FlowLayoutDemo that = new FlowLayoutDemo();
        that.go();
    }

    public void go() {
        frame = new JFrame("Flow Layout");
        Container contentPane = frame.getContentPane();
        contentPane.setBackground(Color.BLACK);
        //将frame的背景设置为黑色
        contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 40));
        button1 = new JButton("OK");
        button2 = new JButton("Cancel");
        button3 = new JButton("Close");

        // 将三个按钮添加到默认内容窗格中
        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(button3);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
