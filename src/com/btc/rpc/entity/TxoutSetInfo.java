package com.btc.rpc.entity;

public class TxoutSetInfo {
    private int height;
    private String bestblock;
    private int transactions;
    private int txouts;
    private long bogosize;
    private String hash_serialized_2;
    private long disk_size;
    private float total_amount;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getBestblock() {
        return bestblock;
    }

    public void setBestblock(String bestblock) {
        this.bestblock = bestblock;
    }

    public int getTransactions() {
        return transactions;
    }

    public void setTransactions(int transactions) {
        this.transactions = transactions;
    }

    public int getTxouts() {
        return txouts;
    }

    public void setTxouts(int txouts) {
        this.txouts = txouts;
    }

    public long getBogosize() {
        return bogosize;
    }

    public void setBogosize(long bogosize) {
        this.bogosize = bogosize;
    }

    public String getHash_serialized_2() {
        return hash_serialized_2;
    }

    public void setHash_serialized_2(String hash_serialized_2) {
        this.hash_serialized_2 = hash_serialized_2;
    }

    public long getDisk_size() {
        return disk_size;
    }

    public void setDisk_size(long disk_size) {
        this.disk_size = disk_size;
    }

    public float getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(float total_amount) {
        this.total_amount = total_amount;
    }
}
