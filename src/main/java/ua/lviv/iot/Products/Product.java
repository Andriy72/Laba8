package ua.lviv.iot.Products;

public class Product {
    private String name;
    private String address;
    private double price;
    private double weight;
    private Integer id;

    public String getHeaders() {
        return "Name" + "," + "Price" + "," + "Address" + "," + "Weight";
    }

    public String toCVS() {
        return getName() + "," + getPrice() + "," + getAddress() + "," + getWeight();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(final double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Product(final String name, final String address, final double price, final double weight, final Integer id) {
        setName(name);
        setAddress(address);
        setPrice(price);
        setWeight(weight);
        setId(id);
    }
}
