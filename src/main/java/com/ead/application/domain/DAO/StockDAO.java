package com.ead.application.domain.DAO;

import com.ead.application.domain.Engine;
import com.ead.application.domain.Stock;

import java.util.List;

/**
 * Created by prabash on 12/1/2015.
 */
public interface StockDAO {
    List<Stock> listStock();

    String addToStock(Stock stock);
}
