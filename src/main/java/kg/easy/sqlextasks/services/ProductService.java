package kg.easy.sqlextasks.services;

import kg.easy.sqlextasks.models.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    Object findByType(String type);
}
