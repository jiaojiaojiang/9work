package task4;
public class Test9_RegularPolygon {
    private int n = 3;
    private double side = 1.0;
    private double x = 0.0;
    private double y = 0.0;

    // 无参构造方法
    public Test9_RegularPolygon(){}
    // 有参构造方法1
    public Test9_RegularPolygon(int n, double side){
        this.n = n;
        this.side = side;
    }
    // 有参构造方法2
    public Test9_RegularPolygon(int n, double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    // getter and setter

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // 返回周长的getPerimeter方法
    public double getPerimeter(){
        return n * side;
    }

    // 返回面积
    public double getArea(){
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }
}
