package kg.easy.sqlextasks.services.impl;

import kg.easy.sqlextasks.dao.ProductRepo;
import kg.easy.sqlextasks.models.Product;
import kg.easy.sqlextasks.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;
    @Override
    public List<Product> findAll() {
        // select * from product
        return productRepo.findAll();
    }

    @Override
    public Object findByType(String type) {
        return productRepo.findAllByType(type);
    }
}
