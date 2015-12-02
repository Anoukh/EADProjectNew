package com.ead.application.service.impl;

import com.ead.application.domain.DAO.EngineDAO;
import com.ead.application.domain.DAO.FinanceDAO;
import com.ead.application.domain.Engine;
import com.ead.application.domain.FinanceTransaction;
import com.ead.application.service.EngineInventoryService;
import com.ead.application.service.FinanceTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by anoukh on 11/20/15.
 */
@Service
public class FinanceTransactionServiceImpl implements FinanceTransactionService{

    @Autowired
    FinanceDAO financeDAO;

    public List<FinanceTransaction> getFinancialTransactions() {return financeDAO.getPendingTransactions();}
    public List<FinanceTransaction> getOutBoxTransactions() {return financeDAO.getOutBoxTransactions();}
    public List<FinanceTransaction> getInFlowTransactions() {return financeDAO.getInFlowTransactions();}
    public List<FinanceTransaction> getOutFlowTransactions() {return financeDAO.getOutFlowTransactions();}

    public void acceptTransaction(int reqnumber, String reqdepartment, int callfrom) {
        System.out.println("hello2");
        financeDAO.acceptTransactionDb(reqnumber,reqdepartment,callfrom);
    }

    public void rejectTransaction(int reqnumber, String reqdepartment, int callfrom) {
        financeDAO.rejectTransactionDb(reqnumber,reqdepartment,callfrom);
    }


}
