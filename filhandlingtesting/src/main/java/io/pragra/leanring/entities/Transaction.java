package io.pragra.leanring.entities;

import java.time.LocalDateTime;

public class Transaction {
    private Type trxType;
    private LocalDateTime transactionDate;
    private int id;
    private double charge;

    public Type getTrxType() {
        return trxType;
    }

    public void setTrxType(Type trxType) {
        this.trxType = trxType;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }
}
