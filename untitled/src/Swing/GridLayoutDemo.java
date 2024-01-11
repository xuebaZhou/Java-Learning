package Swing;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo {

    private JFrame frame;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8;

    public static void main(String[] args) {
        GridLayoutDemo that = new GridLayoutDemo();
        that.go();
    }

    void go() {
        frame = new JFrame("Grid example");
        Container contentPane = frame.getContentPane();
//GridLayout是一种网格式的布局管理器，它将容器
//空间划分成若干行乘若干列的网格，组件依次放入其
//中，每个组件占据一格
        contentPane.setLayout(new GridLayout(4, 2, 1, 1));
        b1 = new JButton("grid_1");
        b2 = new JButton("grid_2");
        b3 = new JButton("grid_3");
        b4 = new JButton("grid_4");
        b5 = new JButton("grid_5");
        b6 = new JButton("grid_6");
        b7 = new JButton("grid_7");
        b8 = new JButton("grid_8");
        contentPane.add(b1);
        contentPane.add(b2);
        contentPane.add(b3);
        contentPane.add(b4);
        contentPane.add(b5);
        contentPane.add(b6);
        contentPane.add(b7);
        contentPane.add(b8);
        frame.pack();
        frame.setVisible(true);

    }
}
