package payment;

public class pay {
    private double price;// 每小时的价格
    private double withhold_rate;// 扣缴率
    private double pay_rate;// 工资率
    private double payment;// 应得工资

    public pay(double price, double withhold_rate, double pay_rate) {
        this.price = price;
        this.withhold_rate = withhold_rate;
        this.pay_rate = pay_rate;
    }

    public pay(double price, double pay_rate) {
        this.price = price;
        this.withhold_rate = 0.15; // 默认扣缴率为15%
        this.pay_rate = pay_rate;
    }

    public pay(double price) {
        this.price = price;
        this.withhold_rate = 0.15; // 默认扣缴率为15%
        this.pay_rate = 0.0465; // 默认工资率为4.65%
    }

    public void computePayment(double hours, double withhold_rate, double pay_rate) {
        payment = hours * price * (1 - withhold_rate) * (1 - pay_rate);
    }

    public void computePayment(double hours, double pay_rate) {
        payment = hours * price * (1 - 0.15) * (1 - pay_rate);
    }

    public void computePayment(double hours) {
        payment = hours * price * (1 - 0.15) * (1 - 0.0465);
    }

    public double getPayment() {
        return payment;
    }
}


