package ua.lviv.iot;

import ua.lviv.iot.Products.Product;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Writer {
    public void writeToFile(final List<Product> productList) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter("D:\\Lab7/list.csv"))) {

            productList.forEach((Product x) -> {
                writer.println(x.getHeaders());
                writer.println(x.toCVS());
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}