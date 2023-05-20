public class Sandwich implements TimsConsumables{
    @Override
    public int getCalories() {
        return 250;
    }

    @Override
    public double getPrice() {
        return 3.5;
    }
    public String toString(){
        return "Item: Sandwich" + "Price: " + getPrice();
    }
}
