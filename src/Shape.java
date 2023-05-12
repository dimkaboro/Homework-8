public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void getArea() {
        System.out.println(String.format("The area of %s is %,.2f", name, calculateArea()));
    }

    public abstract double calculateArea();
}
