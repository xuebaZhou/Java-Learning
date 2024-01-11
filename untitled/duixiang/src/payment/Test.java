package payment;

import payment.pay;

public class Test {
    public static void main(String[] args) {
        pay pay1 = new pay(10, 0.2, 0.3);
        pay1.computePayment(8, 0.2, 0.3);
        System.out.println("应得工资：" + pay1.getPayment());

        pay pay2 = new pay(10, 0.3);
        pay2.computePayment(8, 0.3);
        System.out.println("应得工资：" + pay2.getPayment());

        pay pay3 = new pay(10);
        pay3.computePayment(8);
        System.out.println("应得工资：" + pay3.getPayment());
    }
}