package Abstract.Entities;

public class Circulo extends Shape {

    private Double radius;

    public Circulo() {
        super();
    }

    public Circulo(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public Double area() {
    return  Math.PI * Math.pow(radius, 2);
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

}
