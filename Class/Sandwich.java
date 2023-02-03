
public class Sandwich {
    
    String name;
    int calories;
    int price;

    public Sandwich(String name, int calories, int price) {
        this.name = name;
        if(calories < 0)
            this.calories = 0;
        else
            this.calories = calories;
        if(price < 0)
            this.price = 0;
        else
            this.price = price;
    }

    public boolean isHealthy(){
        return calories <= 250;
    }

    @Override
    public String toString() {
        return "Name: " + name + ". #Cal: " + calories + ". Price $" + price;
    }
}
