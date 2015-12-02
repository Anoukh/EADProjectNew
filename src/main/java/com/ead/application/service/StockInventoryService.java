package com.ead.application.service;


import com.ead.application.domain.Stock;

import java.util.List;

/**
 * Created by prabash on 12/1/2015.
 */
public interface StockInventoryService {


    List<Stock> getAvailableStock();

    String addToStock(Stock stock);




}
