/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 01 - Die
 */

public class Die {

        private int sides;
        private int value;

        public Die(int sides) {
            if(sides < 2)
                sides = 2;
            this.sides = sides;
            value = 1;
        }

        public Die(){
            sides = 6;
            value = 1;
        }

        public void roll() {
            value = (int)(Math.random() * sides) + 1;
        }

        public int getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "Die [sides=" + sides + ", value=" + value + "]";
        }
}
