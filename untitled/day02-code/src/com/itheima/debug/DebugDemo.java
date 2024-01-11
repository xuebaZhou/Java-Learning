package com.itheima.debug;

public class DebugDemo {
    /*
     Debug 工具
                Debug:是供程序员使用的程序调试工具
                    它可以用于查看程序的执行流程，也可以用于追踪程序执行过程来调试程序。
     Debug调试  又被称为断点调试，断点其实是一个标记，告诉Debug从标记的地方开始查看

      如何加断点
                选择要设置断点的代码行，在行号的区域后面单击鼠标左键即可。
       如何开启 Debug 运行
                            在代码区域右键 调试 进行执行。
       点哪里? 向下执行一步?
                            点 步过 这个箭头，也可以直接按F8
                            点 停止 结束Debug
        看哪里?
                看调试器与控制台
        如何删除断点?
                    如果是多个断点，可以每一个再点击一次，也可以一次性全部删除。
                    点击调试台的 查看断点 ，选择要删除的断点，单机鼠标左键即可
    */
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
    }
}
