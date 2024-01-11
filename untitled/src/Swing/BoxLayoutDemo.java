package Swing;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutDemo {

    private JFrame frame;
    private JPanel pv, ph;

    public static void main(String[] args) {
        BoxLayoutDemo that = new BoxLayoutDemo();
        that.go();
    }

    void go() {
//        创建了一个 JFrame 对象，并获取其内容面板作为容器
        frame = new JFrame("Box Layout example");
        Container contentPane = frame.getContentPane();
        pv = new JPanel();
        pv.setLayout(new BoxLayout(pv, BoxLayout.Y_AXIS));
        pv.add(new JLabel("Monday"));
        pv.add(new JLabel("Tuesday"));
        pv.add(new JLabel("Wednesday"));
        pv.add(new JLabel("Thursday"));
        pv.add(new JLabel("Friday"));
        pv.add(new JLabel("Saturday"));
        pv.add(new JLabel("Sunday"));
        contentPane.add(pv, BorderLayout.CENTER);
//        创建一个垂直布局的 JPanel 对象 pv，并将其布局设置为 BoxLayout，并指定垂直方向。
//        然后依次添加了表示星期的标签，并将 pv 添加到内容面板的中央区域。
        ph = new JPanel();
        ph.setLayout(new BoxLayout(ph, BoxLayout.X_AXIS));
        ph.add(new JButton("Yes"));
        ph.add(new JButton("No"));
        ph.add(new JButton("Cancel"));
        // public BoxLayoutLayout(Container target,int axis);
        // target 是为哪个容器设置此布局管理器
        // axis指明组件的排列方向
        contentPane.add(ph, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }
}
