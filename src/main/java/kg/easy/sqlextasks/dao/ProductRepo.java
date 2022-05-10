package kg.easy.sqlextasks.dao;

import kg.easy.sqlextasks.models.Printer;
import kg.easy.sqlextasks.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,String> {


    //select * from product where type = Printer
    List<Product> findAllByType(String type);
}
