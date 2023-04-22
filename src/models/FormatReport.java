package models;

public class FormatReport {
    private String name;
    private int time;

    public FormatReport(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
    public String space(){

        int spac= name.length();
        int total= 20;
        String sapce="";
        for (int i = 0; i < total-spac; i++) {
            sapce +=" ";
        }
        return sapce;
    }
    @Override
    public String toString() {
        return  name  + space() + time + "\n";
    }
}
