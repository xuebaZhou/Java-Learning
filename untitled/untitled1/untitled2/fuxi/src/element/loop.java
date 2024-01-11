package element;

//  编制一个程序，输入月份/年份，输出该月的天数。
import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        // 创建Scanner对象以获取用户输入
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入月份和年份
        System.out.print("请输入月份（1-12）: ");
        int month = scanner.nextInt();
        System.out.print("请输入年份: ");
        int year = scanner.nextInt();

        // 检查输入的月份和年份是否有效
        if (month < 1 || month > 12 || year < 0) {
            System.out.println("输入的月份或年份无效！");
        } else {
            // 调用getDaysInMonth()方法获取该月的天数
            int days = getDaysInMonth(month, year);
            System.out.println(month + "月" + year + "年共有 " + days + " 天");
        }
    }

    // 根据月份和年份计算该月的天数
    public static int getDaysInMonth(int month, int year) {
        int days;

        // 判断月份
        switch (month) {
            case 2: // 二月的天数，需要考虑闰年
                if (isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 4: // 四月
            case 6: // 六月
            case 9: // 九月
            case 11: // 十一月
                days = 30;
                break;
            default: // 其他月份
                days = 31;
                break;
        }

        return days;
    }

    // 判断是否为闰年
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
