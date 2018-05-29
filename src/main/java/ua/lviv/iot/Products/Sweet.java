package ua.lviv.iot.Products;

public class Sweet extends Product {

    private double sugarContent;

    @Override
    public String getHeaders() {
        return super.getHeaders() + "," + "Sugar Content";
    }

    @Override
    public String toCVS() {
        return super.toCVS() + "," + getSugarContent();
    }

    public Sweet(final double price, final String adress, final String name, final double weight, final double sugarContent, final Integer id) {
        super(adress, name, price, weight, id);
        setSugarContent(sugarContent);
    }

    public double getSugarContent() {
        return sugarContent;
    }

    public void setSugarContent(final double sugarContent) {
        this.sugarContent = sugarContent;
    }

    @Override
    public final String toString() {
        return "Sweet{" + "sugarContent=" + getSugarContent() + "}" + "price=" + getPrice() + " name='" + getName() + ", adress='" + getAddress() + "weight=" + getWeight() + '}';
    }
}
