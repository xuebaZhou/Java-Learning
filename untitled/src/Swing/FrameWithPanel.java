package Swing;

import javax.swing.*;
import java.awt.*;

public class FrameWithPanel {
    JFrame frame;//定义一个JFrame对象frame
    JPanel panel;//定义个JPanel对象panel
    JButton button;//定义一个JButton对象button

    public void init() {
        frame = new JFrame("Frame with Panel");
        panel = new JPanel();
        button = new JButton("Press me");
        //获取frame窗口的默认内容窗格
        Container contentPane = frame.getContentPane();
        contentPane.setBackground(Color.CYAN);//将frame的背景设置为蓝绿色
        panel.setBackground(Color.YELLOW);//将panel的背景设置为黄色
        panel.add(button);//将按钮button添加到面板panel中
        contentPane.add(panel, BorderLayout.SOUTH);//将panel添加到frame的南侧
//        contentPane.add(panel,BorderLayout.NORTH);
        frame.setSize(300, 200);  // 设置frame窗口的大小
        frame.setVisible(true);  // 显示frame窗口
    }

    public static void main(String[] args) {
        FrameWithPanel frame = new FrameWithPanel();
        frame.init();
    }
}
