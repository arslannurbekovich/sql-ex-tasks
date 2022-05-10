package kg.easy.sqlextasks.services.impl;

import kg.easy.sqlextasks.dao.PCRepo;
import kg.easy.sqlextasks.models.PC;
import kg.easy.sqlextasks.services.PcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PcServiceImpl implements PcService {

    @Autowired
    private PCRepo pcRepo;
    @Override
    public List<PC> findAll() {
        return pcRepo.findAll();
    }

    @Override
    public List<PC> findByPriceLess(double price) {
        return pcRepo.findAllByPriceLessThan(price);
    }

    @Override
    public Object findAllByPriceAndCdIn(double i, List<String> asList) {
        return pcRepo.findAllByPriceLessThanAndCdIn(i, asList);
    }
}
