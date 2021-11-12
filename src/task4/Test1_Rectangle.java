package task4;
public class Test1_Rectangle {
    public double width = 1.0;
    public double height = 1.0;

    public Test1_Rectangle(){
    }

    public Test1_Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * ( width + height );
    }
}
