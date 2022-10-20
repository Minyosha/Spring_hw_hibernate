package hw_5.Product;

import java.util.List;

public interface ProductDAO {

    public Product saveOrUpdate(Product product);

    public Product findById(Long id);

    public List<Product> findAll();

    public void deleteById(Long id);

}