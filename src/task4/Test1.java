package task4;

public class Test1 {
    public static void main(String[] args) {
        Test1_Rectangle t1 = new Test1_Rectangle(4, 40);
        System.out.println(t1.width + " " + t1.height + " " +
                t1.getArea() + " " + t1.getPerimeter());

        Test1_Rectangle t2 = new Test1_Rectangle(3.5, 35.9);
        System.out.println(t2.width + " " + t2.height + " " +
                t2.getArea() + " " + t2.getPerimeter());
    }

}

