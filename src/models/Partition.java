package models;

import java.util.ArrayList;

public class Partition {
    private  String name;
    private int PartitionSize;
    private ArrayList<ProcessSimulation> processSimulations;

    public Partition(String name, int partitionSize) {
        this.name = name;
        PartitionSize = partitionSize;
        processSimulations = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPartitionSize() {
        return PartitionSize;
    }

    public void setPartitionSize(int partitionSize) {
        PartitionSize = partitionSize;
    }

    public ArrayList<ProcessSimulation> getProcessSimulations() {
        return processSimulations;
    }

    public void setProcessSimulations(ArrayList<ProcessSimulation> processSimulations) {
        this.processSimulations = processSimulations;
    }
}
