package task4;
import java.util.Arrays;
import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        // newһ��100 000�����ֵ�����
        int[] arr = new int[100000];
        Random rd = new Random();
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = rd.nextInt(100000);
        }
        // ��ʱ
        Test6_StopWatch sw = new Test6_StopWatch();
        Arrays.sort(arr);
        sw.stop();
        // ������
        System.out.println("ִ����" + sw.getElaspsedTime() + "����");
    }
}