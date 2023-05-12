public class RightTriangle extends Shape {
    private int side1;
    private int side2;

    public RightTriangle(String name, int side1, int side2) {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double calculateArea() {
        return (side1 * side2) / 2;
    }
}
