package seedu.duke.storage;

import seedu.duke.Account;
import seedu.duke.AccountList;
import seedu.duke.Transaction;
import seedu.duke.TransactionManager;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Dummy Store class for use in unit testing to avoid actually writing to a file
 */
public class TestStore implements StoreInterface {
    public void loadAccountsFromStore (AccountList accounts) throws Exception {
    }


    public void saveAccountsToStore (ArrayList<Account> accounts) throws IOException {
    }


    public void loadTransactionsFromStore (TransactionManager transactions) throws Exception {
    }


    public void saveTransactionsToStore (ArrayList<Transaction> transactions) throws IOException {
    }

}
