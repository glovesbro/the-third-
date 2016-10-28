/**
 * Created by 89294 on 2016/10/24.
 */
public class Triangle extends Shape {
    private double a = 0;
    private double h = 0;

    public Triangle(double a,double h){
        this.a = a;
        this.h = h;
    }
    @Override
    public double getArea() {
            return(a*h/2);
    }
}
