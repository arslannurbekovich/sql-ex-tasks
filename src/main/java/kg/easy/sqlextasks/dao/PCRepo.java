package kg.easy.sqlextasks.dao;

import kg.easy.sqlextasks.models.PC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PCRepo extends JpaRepository<PC, Integer> {

    List<PC> findAllByPriceLessThan(double price);

    List<PC> findAllByPriceLessThanAndCdIn(double price, List<String> list);

}
