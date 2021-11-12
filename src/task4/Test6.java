package task4;
import java.util.Arrays;
import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        // new一个100 000个数字的数组
        int[] arr = new int[100000];
        Random rd = new Random();
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = rd.nextInt(100000);
        }
        // 计时
        Test6_StopWatch sw = new Test6_StopWatch();
        Arrays.sort(arr);
        sw.stop();
        // 输出结果
        System.out.println("执行了" + sw.getElaspsedTime() + "毫秒");
    }
}
