package task4;
public class Test7 {
    public static void main(String[] args) {
        // 创建对象
        Test7_Account ta = new Test7_Account(1122, 20000);
        ta.setAnnualInterestRate(4.5);

        // 取款
        ta.withDraw(2500);
        // 存款
        ta.deposit(3000);

        // 打印
        System.out.println("余额：" + ta.getBalance());
        System.out.println("月利息：" + ta.getMonthlyInterest());
        System.out.println("开户日期：" + ta.getDateCreated());
    }
}
