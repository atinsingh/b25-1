package io.pragra.learnig.test;

import io.pragra.leanring.entities.Account;
import io.pragra.leanring.entities.Type;
import io.pragra.leanring.entities.User;
import io.pragra.learning.logic.AccountService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class AccountServiceTest {

    private static AccountService service;

    @BeforeClass
    public static void creatService(){

        // 10.000001
        // 10.000000

        service = new AccountService();
        User user = new User("Karan", "East York", 1);

        Account account = service.createAccount(user, 3000, 5000, 10);
    }

    @Test
    public void createAccountTest(){

        Assert.assertEquals(1, service.getAccountMap().size());
    }

    @Test
    public void checkDetails(){
            Account account = service.getAccountByName("Karan");

            Assert.assertEquals(3000, account.getMinBalnce(),0.001);
            Assert.assertEquals(10, account.getAllowedTrx());
    }


    @Test
    public void testDebit(){
     Account ac =    service.withdrawAmount("Karan", 900);

     Assert.assertEquals(4100, ac.getBalance(), 0.001);
     Assert.assertEquals(1, ac.getTransactions().size());
     Assert.assertEquals(Type.DEBIT, ac.getTransactions().get(0).getTrxType());

    }

    @Test(expected = RuntimeException.class)
    public void checkIfNegativeAllowed(){
        Account ac =    service.withdrawAmount("Karan", 5900);

    }

}
