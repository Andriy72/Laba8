package ua.lviv.iot;

import ua.lviv.iot.Products.Product;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.core.Response;

@Path("/products")
public class Service {
    private static Map<Integer, Product> productsMap = new HashMap<>();

    @GET
    @Path("{id}/")
    @Produces(MediaType.APPLICATION_JSON)
    public final Product getProduct(final @PathParam("id") Integer id) {
        return productsMap.get(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response createProduct(final Product product) {
        productsMap.put(product.getId(), product);
        return Response.status(200).entity("Good").build();
    }

    @DELETE
    @Path("{id}/")
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response deleteProduct(final @PathParam("id") Integer id) {
        productsMap.remove(id);
        return Response.status(200).entity("Good").build();
    }

    @POST
    public final Response replaceProduct(final Product product) {
        productsMap.put(product.getId(), product);
        return Response.status(200).entity("Good").build();
    }
}