public class Main {
    private static final ShapeName shapeName = new ShapeName();

    public static void main(String[] args) {
        Shape quad = new Quad("Quad", 10);
        shapeName.printShapeName(quad);
        quad.getArea();

        Shape triangle = new Triangle("Triangle", 10, 15);
        shapeName.printShapeName(triangle);
        triangle.getArea();

        Shape rectangle = new Rectangle("Rectangle", 5, 9);
        shapeName.printShapeName(rectangle);
        rectangle.getArea();

        Shape rightTriangle = new RightTriangle("Right Triangle", 10, 15);
        shapeName.printShapeName(rightTriangle);
        rightTriangle.getArea();

        Shape circle = new Circle("Circle", 15);
        shapeName.printShapeName(circle);
        circle.getArea();

    }
}