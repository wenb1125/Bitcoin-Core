package com.btc.rpc.entity;

public class WalletInfo {
    private String walletname;
    private int walletversion;
    private float balance;
    private float unconfirmed_balance;
    private float immature_balance;
    private int txcount;
    private long keypoololdest;
    private int keypoolsize;
    private String hdseedid;
    private int keypoolsize_hd_internal;
    private float paytxfee;
    private boolean private_keys_enabled;
    private boolean avoid_reuse;
    private boolean scanning;

    public String getWalletname() {
        return walletname;
    }

    public void setWalletname(String walletname) {
        this.walletname = walletname;
    }

    public int getWalletversion() {
        return walletversion;
    }

    public void setWalletversion(int walletversion) {
        this.walletversion = walletversion;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getUnconfirmed_balance() {
        return unconfirmed_balance;
    }

    public void setUnconfirmed_balance(float unconfirmed_balance) {
        this.unconfirmed_balance = unconfirmed_balance;
    }

    public float getImmature_balance() {
        return immature_balance;
    }

    public void setImmature_balance(float immature_balance) {
        this.immature_balance = immature_balance;
    }

    public int getTxcount() {
        return txcount;
    }

    public void setTxcount(int txcount) {
        this.txcount = txcount;
    }

    public long getKeypoololdest() {
        return keypoololdest;
    }

    public void setKeypoololdest(long keypoololdest) {
        this.keypoololdest = keypoololdest;
    }

    public int getKeypoolsize() {
        return keypoolsize;
    }

    public void setKeypoolsize(int keypoolsize) {
        this.keypoolsize = keypoolsize;
    }

    public String getHdseedid() {
        return hdseedid;
    }

    public void setHdseedid(String hdseedid) {
        this.hdseedid = hdseedid;
    }

    public int getKeypoolsize_hd_internal() {
        return keypoolsize_hd_internal;
    }

    public void setKeypoolsize_hd_internal(int keypoolsize_hd_internal) {
        this.keypoolsize_hd_internal = keypoolsize_hd_internal;
    }

    public float getPaytxfee() {
        return paytxfee;
    }

    public void setPaytxfee(float paytxfee) {
        this.paytxfee = paytxfee;
    }

    public boolean isPrivate_keys_enabled() {
        return private_keys_enabled;
    }

    public void setPrivate_keys_enabled(boolean private_keys_enabled) {
        this.private_keys_enabled = private_keys_enabled;
    }

    public boolean isAvoid_reuse() {
        return avoid_reuse;
    }

    public void setAvoid_reuse(boolean avoid_reuse) {
        this.avoid_reuse = avoid_reuse;
    }

    public boolean isScanning() {
        return scanning;
    }

    public void setScanning(boolean scanning) {
        this.scanning = scanning;
    }
}
