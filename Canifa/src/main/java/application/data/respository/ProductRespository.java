package application.data.respository;

import application.data.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRespository extends JpaRepository<Product,Integer>{
    @Query("select count (p.id) from tbl_product p")
    long getTotalProducts();
}
