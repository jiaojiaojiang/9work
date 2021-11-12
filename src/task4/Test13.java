package task4;
import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        // ��������
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array:");
        int rows = input.nextInt(), cols = input.nextInt();
        double[][] arr = new double[rows][cols];

        // ���鸳ֵ
        System.out.println("Enter the array:");
        for (int a = 0 ; a < rows ; a++){
            for (int b = 0 ; b < cols ; b++){
                arr[a][b] = input.nextDouble();
            }
        }

        // ���������ֵ����
        Test13_Location l = new Test13_Location();
        l = locateLargest(arr);

        // ������
        System.out.println("The location of the largest elements is " + Test13_Location.maxValue +
                " at (" + Test13_Location.row + ", " + Test13_Location.column + ")");
    }

    public static Test13_Location locateLargest(double[][] a){
        Test13_Location l = new Test13_Location();
        for (int m = 0 ; m < a.length ; m++){
            for (int n = 0 ; n < a[0].length ; n++){
                if (Test13_Location.maxValue < a[m][n]){
                    Test13_Location.maxValue = a[m][n];
                    Test13_Location.row = m;
                    Test13_Location.column = n;
                }
            }
        }
        return l;
    }
}
