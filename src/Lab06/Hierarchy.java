package Lab06;

public class Hierarchy {
    abstract class Shape {
        protected double volume;

        public double getVolume() {
            return volume;
        }
    }

    abstract class SolidOfRevolution extends Shape {
        protected double radius;

        public double getRadius() {
            return radius;
        }
    }

    class Cylinder extends SolidOfRevolution {
        private double height;

        public Cylinder(double radius, double height) {
            this.radius = radius;
            this.height = height;
            this.volume = Math.PI * radius * radius * height;
        }
    }

    class Ball extends SolidOfRevolution {
        public Ball(double radius) {
            this.radius = radius;
            this.volume = (4/3) * Math.PI * radius * radius * radius;
        }
    }

}
