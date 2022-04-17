package TheaterSystem.Models;

public class Discount {
    private String name;
    private double priceCut;

    public Discount(String name, double priceCut){
        this.name = name;
        this.priceCut = priceCut;
    }

    public double getPrice(double price){
        return price - (price * priceCut);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceCut() {
        return priceCut;
    }

    public void setPriceCut(double priceCut) {
        this.priceCut = priceCut;
    }
}
