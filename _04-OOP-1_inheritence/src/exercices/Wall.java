package exercices;

public class Wall {
    private double width = 0;
    private double height = 0;

    public Wall() {
        this(0, 0);
    }

    public Wall(double width, double height) {
        this.width = setZero(width);
        this.height = setZero(height);;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        this.width = setZero(width);
    }

    public void setHeight(double height) {
        this.height = setZero(height);
    }

    public double getArea() {
        return width * height;
    }

    private double setZero(double param) {
        if (param < 0) {
            return 0;
        }
        return param;
    }
}
