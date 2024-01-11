package Swing;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("网格布袋布局 ");
        frame.setSize(300, 200);
//        设置了窗口的大小为宽度300像素、高度200像素
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        当用户关闭窗口时的默认操作。JFrame.EXIT_ON_CLOSE 表示在关闭窗口时终止程序的运行
        Container contentPane = frame.getContentPane();
        GridBagLayout gl = new GridBagLayout();//创建一个网格布袋管理器
        contentPane.setLayout(gl);//设置窗口的布局为网格布袋管理器
        GridBagConstraints gc = new GridBagConstraints();//创建网格布袋约束
        int[] gx = {0, 0, 1, 2, 3, 0, 1, 2, 0, 2};//定义组件的横坐标
        int[] gy = {0, 1, 1, 1, 1, 2, 2, 2, 3, 3};//定义组件的纵坐标
        int[] gw = {4, 1, 1, 1, 1, 1, 1, 1, 2, 2};//定义组件占据的行数
        int[] gh = {1, 1, 1, 1, 2, 1, 1, 1, 1, 1};//定义组件占据的列数
        JButton button;
        String name;
//创建10个按钮分别放到窗口的相应网格中
        for (int i = 0; i < gx.length; i++) {
            name = "单元 " + (i + 1); //按钮的标题
            button = new JButton(name);//创建按钮
            gc.gridx = gx[i];//设定组件的横坐标
            gc.gridy = gy[i];//设定组件的纵坐标
            gc.gridwidth = gw[i];//设定组件占据的行数
            gc.gridheight = gh[i];//设定组件占据的列数
            gc.weightx = 100;//设定组件的横向增量值
            gc.weighty = 100;//设定组件的纵向增量值
            gc.fill = GridBagConstraints.BOTH
            ;//设定组件的填充方式
            gl.setConstraints(button, gc);//设定组件的约束对象
            contentPane.add(button);
        }
        frame.setVisible(true);
    }
}
