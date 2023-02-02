public class rectangle {
    
    // variables
    int width;
    int height;

    // constructor
    rectangle(int width, int height) {
        if (width <= 0)
            this.width = 1;
        else
            this.width = width;
        this.height = height <= 0 ? 1 : height;
    }

    rectangle() {
        width = height = 1;
    }

    // Methods
    double area() {
        return width * height;
    }

    double perimeter() {
        return 2 * width + 2 * height;
    }

    double diagonal() {
        return Math.sqrt(width * width + height * height);
    }
}
