package kg.easy.sqlextasks.services;

import kg.easy.sqlextasks.models.PC;

import java.util.List;

public interface PcService {

    List<PC> findAll();

    List<PC> findByPriceLess(double price);

    Object findAllByPriceAndCdIn(double i, List<String> asList);
}
