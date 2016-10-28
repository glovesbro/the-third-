/**
 * Created by 89294 on 2016/10/24.
 */
public class Circle extends Shape {
    private double r = 0;
    private final static double PI =3.14;
    public Circle(double r){
        this.r = r;
    }

    @Override
    public double getArea() {
        return(PI*r*r);
    }
}
