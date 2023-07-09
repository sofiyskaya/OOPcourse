package Domen;

public class HotDrink extends Product {
    public int temp;

    public HotDrink(int price, int place, String name, long id, int temp){
        super(price, place, name, id);
        this.temp = temp;
    }

    @Override
    public String toString() {
        return super.toString() + "Temperature = " + temp + "\n";
    }
}
