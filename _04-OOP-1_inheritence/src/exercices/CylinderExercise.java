package exercices;

public class CylinderExercise {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
    }

    public static class Circle {
        private double radius;

        public Circle(double radius) {
            this.radius = radius < 0 ? 0 : radius;
        }

        public double getRadius() {
            return radius;
        }

        public double getArea() {
            return (radius * radius * Math.PI);
        }
    }

    public static class Cylinder extends Circle {
        private double height;

        public Cylinder(double radius, double height) {
            super(radius);
            this.height = height < 0 ? 0 : height;
        }

        public double getHeight() {
            return height;
        }

        public double getVolume(){
            return (getArea() * height);
        }
    }
}

