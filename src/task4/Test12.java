package task4;
import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        // 获取用户输入的四个点
        System.out.println("请输入四个点的坐标值");
        Scanner input = new Scanner(System.in);
        double x1 = input.nextDouble(), y1 = input.nextDouble();
        double x2 = input.nextDouble(), y2 = input.nextDouble();
        double x3 = input.nextDouble(), y3 = input.nextDouble();
        double x4 = input.nextDouble(), y4 = input.nextDouble();

        // 求a b c d e f
        double a = - (y2 - y1) / (x2 - x1);
        double b = 1.0, d = 1.0;
        double c = - (y4 - y3) / (x4 -x3);
        double e = a * x1 + y1;
        double f = c * x3 + y3;

        // 传入数值
        Test11_LinearEquation le = new Test11_LinearEquation(a, b, c, d, e, f);

        // 判断是否有结果
        boolean bool = le.isSolvable();

        if (bool){
            System.out.println("x is " + le.getX() + " and y is " + le.getY());
        } else
            System.out.println("The equation has no solution");
    }
}

