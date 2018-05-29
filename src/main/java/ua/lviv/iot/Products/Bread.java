package ua.lviv.iot.Products;

public class Bread extends Product {

    private boolean quality;

    @Override
    public String getHeaders() {
        return super.getHeaders() + "," + "Quality";
    }

    @Override
    public String toCVS() {
        return super.toCVS() + "," + isQuality();
    }

    public Bread(final double price, final String adress, final String name, final boolean quality, final double weight, final Integer id) {
        super(adress, name, weight, price, id);
        setQuality(quality);
    }

    public boolean isQuality() {
        return quality;
    }

    public void setQuality(final boolean quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Bread{" + "quality=" + isQuality() + "price=" + getPrice() + " name='" + getName() + ", adress='" + getAddress() + "weight=" + getWeight() + '}';
    }
}
