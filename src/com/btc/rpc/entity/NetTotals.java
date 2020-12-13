package com.btc.rpc.entity;

public class NetTotals {
    private int totalbytesrecv;
    private int totalbytessent;
    private long timemillis;
    private UploadTarget uploadtarget;

    public int getTotalbytesrecv() {
        return totalbytesrecv;
    }

    public void setTotalbytesrecv(int totalbytesrecv) {
        this.totalbytesrecv = totalbytesrecv;
    }

    public int getTotalbytessent() {
        return totalbytessent;
    }

    public void setTotalbytessent(int totalbytessent) {
        this.totalbytessent = totalbytessent;
    }

    public long getTimemillis() {
        return timemillis;
    }

    public void setTimemillis(long timemillis) {
        this.timemillis = timemillis;
    }

    public UploadTarget getUploadtarget() {
        return uploadtarget;
    }

    public void setUploadtarget(UploadTarget uploadtarget) {
        this.uploadtarget = uploadtarget;
    }
}
