package task4;
public class Test7 {
    public static void main(String[] args) {
        // ��������
        Test7_Account ta = new Test7_Account(1122, 20000);
        ta.setAnnualInterestRate(4.5);

        // ȡ��
        ta.withDraw(2500);
        // ���
        ta.deposit(3000);

        // ��ӡ
        System.out.println("��" + ta.getBalance());
        System.out.println("����Ϣ��" + ta.getMonthlyInterest());
        System.out.println("�������ڣ�" + ta.getDateCreated());
    }
}
