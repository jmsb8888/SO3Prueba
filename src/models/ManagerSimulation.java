package models;

import java.util.ArrayList;

public class ManagerSimulation {
    private ArrayList<Partition> partitions;
    private int simulatorTime;

    public ManagerSimulation(ArrayList<Partition> partitions, int simulatorTime) {
        this.partitions = partitions;
        this.simulatorTime = simulatorTime;
    }

    public String startSimulation(){
        ManagerProcess managerProcess;
        String result="";
        for (Partition partition: partitions) {
            result += "\n*********************  RESULTADOS PARA LA PARTICION "+ partition.getName().toUpperCase()+" ********************\n";
            managerProcess= new ManagerProcess(simulatorTime, partition.getProcessSimulations(), partition.getPartitionSize());
            result+= managerProcess.startSimulation();
        }
        return result;
    }
}
