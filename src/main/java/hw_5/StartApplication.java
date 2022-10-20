package hw_5;

import hw_5.Product.Product;
import hw_5.Product.ProductDAO;
import hw_5.Product.ProductDaoImpl;

import java.util.List;

public class StartApplication {

    private final ProductDAO productDAO = new ProductDaoImpl();


    public void checkTasks(){
        homework();

    }


    public void homework(){
        createProduct();
        findProduct();
        findAllProducts();
        updateProduct();
        deleteProduct();
    }

    public void createProduct(){
        System.out.println("Create");
        Product createdProduct = new Product();
        createdProduct.setTitle("Created Product");
        createdProduct.setCost(55);
        System.out.println("Created product: " + createdProduct);
        Product savedProduct = productDAO.saveOrUpdate(createdProduct);
        System.out.println("Saved product: " + savedProduct);
    }

    public void findProduct(){
        System.out.println("Find by ID");
        Long id = 2L;
        Product product = productDAO.findById(id);
        System.out.println("item with id = 2: " + product);
    }

    public void findAllProducts(){
        System.out.println("Find all");
        List<Product> productList = productDAO.findAll();
        System.out.println("size of the table: " + productList.size());
        productList.forEach(System.out::println);
    }

    public void updateProduct(){
        System.out.println("Update");
        Long id = 2L;
        Product product = productDAO.findById(id);
        System.out.println("Item (id = 2) before: " + product);
        product.setTitle("Changed Product");
        product.setCost(13);
        Product updatedProduct = productDAO.saveOrUpdate(product);
        System.out.println("Item (id = 2) after: " + updatedProduct);
    }

    public void deleteProduct(){
        System.out.println("Delete");
        Long id = 2L;
        System.out.println("Deleting item with id = 2...");
        productDAO.deleteById(id);
        Product product = productDAO.findById(id);
        System.out.println("Searching results for item with id = 2: " + product);
    }



}
