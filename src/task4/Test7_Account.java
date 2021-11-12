package task4;
import java.util.Date;

public class Test7_Account {
    // 四个私有数据域
    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    private Date dateCreated;

    // 无参构造方法
    public Test7_Account(){
    }
    // 有参构造方法
    public Test7_Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }
    // id balance annualInterestRate的setter和getter
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    // dateCreated的访问器方法
    public Date getDateCreated(){
        return dateCreated;
    }

    // getMonthlyInterestRate方法
    public double getMonthlyInterestRate(){
        return annualInterestRate / 1200;
    }

    // getMonthlyInterest方法
    public double getMonthlyInterest(){
        return annualInterestRate * balance / 1200;
    }

    // withDraw方法
    public void withDraw(double num){
        if (num <= balance) balance -= num;
    }

    // deposit方法
    public void deposit(double num){
        balance += num;
    }
}
