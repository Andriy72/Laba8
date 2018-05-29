//package ua.lviv.iot;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import ua.lviv.iot.Products.Bread;
//import ua.lviv.iot.Products.Dairy;
//import ua.lviv.iot.Products.Product;
//import ua.lviv.iot.Products.Sweet;
//
//import java.util.LinkedList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class ManagerTest {
//    private ProductManager pm;
//
//    @BeforeEach // перед кожним виконується
//    void init() {
//        pm = new ProductManager();
//
//        pm.addProduct(new Bread(11, "Puskina", "Bread", true, 122));
//        pm.addProduct(new Dairy(15.0, 5.8, "Bread", "Dairy", 140));
//        pm.addProduct(new Sweet(11, "Puskina", "Sweet", 5.0, 12));
//    }
//
//    @Test
//    void testPrintList() { // чисто статична перевірка
//        pm.printList(pm.getProductList());
//        List<Product> expected = new LinkedList<>();
//        assertNotEquals(expected, pm.getProductList(), "Lists don't match");
//    }
//
//    @Test
//    void testAddGood() { // спочатку список пустий, потім ти в нього шось додаєш і він не пустий це перевіряється
//        pm = new ProductManager();
//        List<Product> productList = new LinkedList<>();
//        assertTrue(productList.isEmpty());
//        productList.add(new Bread(11, "Puskina", "Bread", true, 122));
//        assertFalse(productList.isEmpty());
//    }
//
//    @Test
//    void testFindGoodByName() {
//        pm = new ProductManager();
//        Bread bread = new Bread(11, "Bread", "Bread", true, 122);
//        Dairy dairy = new Dairy(15.0, 5.8, "Dairy", "Dairy", 140);
//        pm.addProduct(bread);
//        pm.addProduct(dairy); // додай створені продукти в список і шукаєш за іменем
//        List<Product> result = pm.findGoods("Bread");
//        assertEquals(bread, result.get(0), "Name doesn't match");
//    }
//
//    @Test
//    void testSortByWeight() {
//        List<Product> result = pm.getProductList();
//        pm.sortByWeight(result);
//
//        assertEquals(11, result.get(2).getWeight(), "Weight doesn't match"); // після сортування ти припускаєш, що вага останнього елемента 11 і це тру
//    }
//
//    @Test
//    final void testGeneralToString() {  // перевіряє чи ніде ту стрінг не поламався
//        assertFalse(pm.getProductList().toString().contains("@"));
//    }
//
//    @Test
//    public void testWritter() {
//        Writer wrtiter = new Writer();
//        try {
//            wrtiter.writeToFile(pm.getProductList());
//        } catch(Exception e) {
//            assertFalse(false, "Unexpected exception was thrown");
//        }
//    }
//
//}
