/**
 * Created by 89294 on 2016/10/24.
 */
public class Square extends Shape {
    private double height = 0;
    public Square(double height){
        this.height = height;
    }

    @Override
    public double getArea() {
        return(this.height*this.height);
    }
}
