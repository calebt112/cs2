/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Students Names: 
 * Description: Lab 01 - Bee
 */

public class BSol {

    public static final int WORKER = 0;
    public static final int DRONE  = 1;
    public static final int QUEEN  = 2;

    private int type;
    private String name;
    private int x, y;

    public BSol(String name) {
        this(name, WORKER);
    }

    public BSol(String name, int type) {
        if (type != WORKER && type != DRONE && type != QUEEN)
            this.type = WORKER;
        else
            this.type = type;
        x = y = 0;
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private String getTypeAsString() {
        if (type == WORKER)
            return "worker";
        else if (type == DRONE)
            return "drone";
        else
            return "queen";
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isInsideHive() {
        return x == 0 && y == 0;
    }

    @Override
    public String toString() {
        String out = getTypeAsString() + " from \"" + name + "\" is ";
        if (isInsideHive())
            out += "inside the hive!";
        else
            out += "outside the hive @(" + x + ", " + y + ")";
        return out;
    }
}
