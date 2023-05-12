public class Quad extends Shape {
    private int side;

    public Quad(String name, int side) {
        super(name);
        this.side = side;
    }
    @Override
    public double calculateArea() {
        return side * side;
    }
}
