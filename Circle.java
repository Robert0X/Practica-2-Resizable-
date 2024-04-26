public class Circle implements Resizable {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void resize(int rate) {
        this.radius *= rate;
    }

    public int getRadius() {
        return radius;
    }
}