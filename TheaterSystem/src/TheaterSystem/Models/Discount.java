package TheaterSystem.Models;

public class Discount {
    private string name;
    private double priceCut;

    public Discount(string name, double priceCut){
        this.name = name;
        this.priceCut = priceCut;
    }

    public double getPrice(string price){
        return price - (price * priceCut);
    }



    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }

    public double getPriceCut() {
        return priceCut;
    }

    public void setPriceCut(double priceCut) {
        this.priceCut = priceCut;
    }
}
