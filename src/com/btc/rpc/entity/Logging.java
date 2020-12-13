package com.btc.rpc.entity;

public class Logging {
    private boolean net;
    private boolean tor;
    private boolean mempool;
    private boolean http;
    private boolean bench;
    private boolean zmq;
    private boolean walletdb;
    private boolean rpc;
    private boolean estimatefee;
    private boolean addrman;
    private boolean selectcoins;
    private boolean reindex;
    private boolean cmpctblock;
    private boolean rand;
    private boolean prune;
    private boolean proxy;
    private boolean mempoolrej;
    private boolean libevent;
    private boolean coindb;
    private boolean qt;
    private boolean leveldb;
    private boolean validation;

    public boolean isNet() {
        return net;
    }

    public void setNet(boolean net) {
        this.net = net;
    }

    public boolean isTor() {
        return tor;
    }

    public void setTor(boolean tor) {
        this.tor = tor;
    }

    public boolean isMempool() {
        return mempool;
    }

    public void setMempool(boolean mempool) {
        this.mempool = mempool;
    }

    public boolean isHttp() {
        return http;
    }

    public void setHttp(boolean http) {
        this.http = http;
    }

    public boolean isBench() {
        return bench;
    }

    public void setBench(boolean bench) {
        this.bench = bench;
    }

    public boolean isZmq() {
        return zmq;
    }

    public void setZmq(boolean zmq) {
        this.zmq = zmq;
    }

    public boolean isWalletdb() {
        return walletdb;
    }

    public void setWalletdb(boolean walletdb) {
        this.walletdb = walletdb;
    }

    public boolean isRpc() {
        return rpc;
    }

    public void setRpc(boolean rpc) {
        this.rpc = rpc;
    }

    public boolean isEstimatefee() {
        return estimatefee;
    }

    public void setEstimatefee(boolean estimatefee) {
        this.estimatefee = estimatefee;
    }

    public boolean isAddrman() {
        return addrman;
    }

    public void setAddrman(boolean addrman) {
        this.addrman = addrman;
    }

    public boolean isSelectcoins() {
        return selectcoins;
    }

    public void setSelectcoins(boolean selectcoins) {
        this.selectcoins = selectcoins;
    }

    public boolean isReindex() {
        return reindex;
    }

    public void setReindex(boolean reindex) {
        this.reindex = reindex;
    }

    public boolean isCmpctblock() {
        return cmpctblock;
    }

    public void setCmpctblock(boolean cmpctblock) {
        this.cmpctblock = cmpctblock;
    }

    public boolean isRand() {
        return rand;
    }

    public void setRand(boolean rand) {
        this.rand = rand;
    }

    public boolean isPrune() {
        return prune;
    }

    public void setPrune(boolean prune) {
        this.prune = prune;
    }

    public boolean isProxy() {
        return proxy;
    }

    public void setProxy(boolean proxy) {
        this.proxy = proxy;
    }

    public boolean isMempoolrej() {
        return mempoolrej;
    }

    public void setMempoolrej(boolean mempoolrej) {
        this.mempoolrej = mempoolrej;
    }

    public boolean isLibevent() {
        return libevent;
    }

    public void setLibevent(boolean libevent) {
        this.libevent = libevent;
    }

    public boolean isCoindb() {
        return coindb;
    }

    public void setCoindb(boolean coindb) {
        this.coindb = coindb;
    }

    public boolean isQt() {
        return qt;
    }

    public void setQt(boolean qt) {
        this.qt = qt;
    }

    public boolean isLeveldb() {
        return leveldb;
    }

    public void setLeveldb(boolean leveldb) {
        this.leveldb = leveldb;
    }

    public boolean isValidation() {
        return validation;
    }

    public void setValidation(boolean validation) {
        this.validation = validation;
    }
}
