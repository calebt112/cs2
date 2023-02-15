/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 04 - Cylinder
 */

class Cylinder extends Solid {

        private double radius;
        private double height;

        public Cylinder() {
            radius = Solid.DEFAULT_MEASURE;
            height = Solid.DEFAULT_MEASURE;
        }

        public Cylinder(double radius, double height) {
            if(radius <= 0)
                this.radius = Solid.DEFAULT_MEASURE;
            else
                this.radius = radius;
            if(height <= 0)
                this.height = Solid.DEFAULT_MEASURE;
            else
                this.height = height;
        }

        public double getRadius() {
            return radius;
        }

        public double getHeight() {
            return height;
        }

        @Override
        public double volume() {
            return Math.PI * Math.pow(radius, 2) * height;
        }

        @Override
        public String toString() {
            return "Cylinder{" +
                    "radius=" + radius +
                    ", height=" + height +
                    '}';
        }
}

