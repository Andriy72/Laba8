package ua.lviv.iot.Products;

public class Dairy extends Product {

    private double fatContent;

    @Override
    public String getHeaders() {
        return super.getHeaders() + "," + "Fat Content";
    }

    @Override
    public String toCVS() {
        return super.toCVS() + "," + getFatContent();
    }

    public Dairy(final double fatContent, final double price, final String adress, final String name, final double weight, final Integer id) {
        super(adress, name, weight, price, id);
        setFatContent(fatContent);
    }

    public double getFatContent() {
        return fatContent;
    }

    public void setFatContent(final double fatContent) {
        this.fatContent = fatContent;
    }

    @Override
    public final String toString() {
        return "Dairy{" + "fatContent=" + getFatContent() + ", name='" + getName() + ", adress='" + getAddress() +  ", price=" + getPrice() + "weight="+ getWeight() + "} ";
    }

}

