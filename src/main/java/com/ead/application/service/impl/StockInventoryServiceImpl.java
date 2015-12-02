package com.ead.application.service.impl;

import com.ead.application.domain.DAO.StockDAO;
import com.ead.application.domain.Engine;
import com.ead.application.domain.Stock;
import com.ead.application.service.StockInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by prabash on 12/1/2015.
 */
@Service
public class StockInventoryServiceImpl implements StockInventoryService{


    @Autowired
    StockDAO stockDAO;

    public List<Stock> getAvailableStock() {
        return stockDAO.listStock();
    }


   public String addToStock(Stock stock)
    {
            return stockDAO.addToStock(stock);
    }







}
