package kg.easy.sqlextasks.services.impl;

import kg.easy.sqlextasks.services.PcService;
import kg.easy.sqlextasks.services.PrinterService;
import kg.easy.sqlextasks.services.ProductService;
import kg.easy.sqlextasks.services.TaskService;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;


//SOLID

// Single Responsibility

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private PcService pcService;
    @Autowired
    private PrinterService printerService;
    @Autowired
    private ProductService productService;

    @Override
    public Object execute(String taskNum) {
        switch (taskNum){
            case "1":
                return pcService.findByPriceLess(500);
            case "2":
                return productService.findByType("Printer");
            case "5":
                return pcService.findAllByPriceAndCdIn(600, Arrays.asList("12x", "24x"));

        }

        return null;
    }
}
