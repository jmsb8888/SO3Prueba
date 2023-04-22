package models;

public class ProcessSimulation {
    private String procesName;
    private int time;
    private boolean isBlock;
    private int size;

    public ProcessSimulation(String procesName, int time, boolean isBlock, int size) {
        this.procesName = procesName;
        this.time = time;
        this.isBlock = isBlock;
        this.size = size;
    }

    public String getProcesName() {
        return procesName;
    }

    public void setProcesName(String procesName) {
        this.procesName = procesName;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public boolean isBlock() {
        return isBlock;
    }

    public void setBlock(boolean block) {
        isBlock = block;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
