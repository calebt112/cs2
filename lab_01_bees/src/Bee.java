/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Students Names: 
 * Description: Lab 01 - Bee
 */

public class Bee {

    public static final int WORKER = 0;
    public static final int DRONE  = 1;
    public static final int QUEEN  = 2;

    private String beehive;
    private int x, y, type;

    public Bee(String beehive){
        this.beehive = beehive;
        x = 0;
        y = 0;
        type = WORKER;
    }

    public Bee(String beehive, int type){
        this.beehive = beehive;
        if(type == WORKER || type == DRONE || type == QUEEN)
            this.type = type;
        else
            this.type = WORKER;
        x = 0;
        y = 0;
    }

    public String getBeehive() {
        return beehive;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getType() {
        return type;
    }

    public String getTypeAsString(){
        if (type == WORKER)
            return "WORKER";
        else if (type == DRONE)
            return "DRONE";
        else
            return "QUEEN";
    }

    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean isInsideHive(){
        return x == 0 && y == 0;
    }

    @Override
    public String toString() {
        if(isInsideHive())
            return getTypeAsString() + " bee from " + beehive + " is inside the hive";
        else
            return getTypeAsString() + " bee from " + beehive + " is @ (" + x + ", " + y + ")";
    }
}
