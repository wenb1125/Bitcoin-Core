package com.btc.rpc.entity;

public class UploadTarget {
    private int timeframe;
    private int target;
    private boolean target_reached;
    private boolean serve_historical_blocks;
    private int bytes_left_in_cycle;
    private int time_left_in_cycle;

    public int getTimeframe() {
        return timeframe;
    }

    public void setTimeframe(int timeframe) {
        this.timeframe = timeframe;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public boolean isTarget_reached() {
        return target_reached;
    }

    public void setTarget_reached(boolean target_reached) {
        this.target_reached = target_reached;
    }

    public boolean isServe_historical_blocks() {
        return serve_historical_blocks;
    }

    public void setServe_historical_blocks(boolean serve_historical_blocks) {
        this.serve_historical_blocks = serve_historical_blocks;
    }

    public int getBytes_left_in_cycle() {
        return bytes_left_in_cycle;
    }

    public void setBytes_left_in_cycle(int bytes_left_in_cycle) {
        this.bytes_left_in_cycle = bytes_left_in_cycle;
    }

    public int getTime_left_in_cycle() {
        return time_left_in_cycle;
    }

    public void setTime_left_in_cycle(int time_left_in_cycle) {
        this.time_left_in_cycle = time_left_in_cycle;
    }
}
