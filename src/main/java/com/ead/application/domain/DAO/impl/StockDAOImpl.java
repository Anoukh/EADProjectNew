package com.ead.application.domain.DAO.impl;

import com.ead.application.domain.DAO.StockDAO;
import com.ead.application.domain.Engine;
import com.ead.application.domain.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


/**
 * Created by prabash on 12/1/2015.
 */
@Repository
public class StockDAOImpl implements StockDAO{
   @Autowired
   DataSource dataSource;

    public List<Stock> listStock() {
//        logger.debug("Entered DAO");
        List<Stock> stocks = null;

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        String sql = "SELECT engine_id, engine_name FROM (SELECT * FROM tbl_engine NATURAL JOIN tbl_stock) as estock WHERE estock.status = 'WIP'";

        stocks = jdbcTemplate.query(sql, new RowMapper<Stock>() {

            public Stock mapRow(ResultSet resultSet, int i) throws SQLException {
//               ` logger.debug("Entered Query");
                Stock stock = new Stock();

                stock.setengine_id(resultSet.getInt("engine_id"));
                stock.setengineName(resultSet.getString("engine_name"));

                System.out.println(stock.getengineName());
//                logger.debug("End of Query");
                return stock;
            }
        });

//        logger.debug("Return Query");
        return stocks;
    }


    public String addToStock(Stock stock)
    {

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        String sql = "INSERT INTO tbl_stock (engine_id, no_of_units, status)"
                + " VALUES (?, ?, ?)";

        try {
            jdbcTemplate.update(sql,stock.getengine_id() ,stock.getNo_of_units(), "WIP");
        }catch (Exception e) {
            System.out.println(e);
            return "Error";
        }

        return "Success";

    }

}
