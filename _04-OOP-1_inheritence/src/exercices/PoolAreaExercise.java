package exercices;

public class PoolAreaExercise {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }

    public static class Rectangle {
        private double width;
        private double length;

        public Rectangle(double width, double length) {
            this.width = width < 0 ? 0 : width;
            this.length = length < 0 ? 0 : length;
        }

        public double getWidth() {
            return width;
        }

        public double getLength() {
            return length;
        }

        public double getArea() {
            return (width * length);
        }
    }

    public static class Cuboid extends Rectangle {
        private double height;

        public Cuboid(double width, double length, double height) {
            super(width, length);
            this.height = height < 0 ? 0 : height;
        }

        public double getHeight() {
            return height;
        }

        public double getVolume() {
            return (getArea() * height);
        }
    }
}
