/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 04 - Cube
 */

class Cube extends Solid {

        private double side;

        public Cube() {
            side = Solid.DEFAULT_MEASURE;
        }

        public Cube(double side) {
            if(side < 0)
                this.side = Solid.DEFAULT_MEASURE;
            else
                this.side = side;
        }

        public double getSide() {
            return side;
        }

        @Override
        public double volume() {
            return side * side * side;
        }

        @Override
        public String toString() {
            return "Cube: side = " + side + ", volume = " + volume();
        }
}

