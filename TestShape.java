/**
 * Created by 89294 on 2016/10/24.
 */
public class TestShape {
    public static void main(String args []){
        Shape triangle = new Triangle(3,4);
        Shape circle = new Circle(3);
        Shape square = new Square(3);
        System.out.println(square.getArea());
        System.out.println(circle.getArea());
        System.out.println(triangle.getArea());


    }
}
