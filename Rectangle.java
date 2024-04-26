public class Rectangle implements Resizable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resize(int rate) {
        this.width *= rate;
        this.height *= rate;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}