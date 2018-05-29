package ua.lviv.iot;

import ua.lviv.iot.Products.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public final class ProductManager {
    private List<Product> productList = new ArrayList<>();

    public ProductManager() {
    }

    public void printList(final List<Product> list) {
        list.forEach((Product product) -> System.out.println(product.toString()));
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void addProduct(final Product product) {
        productList.add(product);
    }

    public List<Product> findGoods(final String name) {
        List<Product> resultProduct = new LinkedList<>();
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                resultProduct.add(product);
            }
        }
        return resultProduct;
    }

    public List<Product> sortByWeight(final List<Product> products) {
        products.sort(Comparator.comparing(Product::getWeight));
        return products;
    }
}
