package kg.easy.sqlextasks.dao;

import kg.easy.sqlextasks.models.Printer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrinterRepo extends JpaRepository<Printer, Integer> {

}
