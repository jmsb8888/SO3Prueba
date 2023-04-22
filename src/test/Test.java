package test;

import models.ManagerSimulation;
import models.Partition;
import models.ProcessSimulation;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Partition> partitions= new ArrayList<>();
        Partition partition1= new Partition("Uno", 60);
        Partition partition2= new Partition("Dos", 60);
        Partition partition3= new Partition("Tres", 60);
        Partition partition4= new Partition("Cuatro", 60);
        Partition partition5= new Partition("Cinco", 40);

        ProcessSimulation processSimulation1= new ProcessSimulation("P1", 10, true, 40);
        ProcessSimulation processSimulation2= new ProcessSimulation("P2", 15, false, 40);
        ProcessSimulation processSimulation3= new ProcessSimulation("P3", 9, true, 40);

        ProcessSimulation processSimulation4= new ProcessSimulation("P4", 14, false, 40);
        ProcessSimulation processSimulation5= new ProcessSimulation("P5", 10, false, 40);
        ProcessSimulation processSimulation6= new ProcessSimulation("P6", 5, true, 40);

        ProcessSimulation processSimulation7= new ProcessSimulation("P7", 4, false, 40);
        ProcessSimulation processSimulation8= new ProcessSimulation("P8", 12, false, 40);
        ProcessSimulation processSimulation9= new ProcessSimulation("P9", 21, false, 40);

        ProcessSimulation processSimulation10= new ProcessSimulation("P10", 15, true, 40);
        ProcessSimulation processSimulation11= new ProcessSimulation("P11", 10, true, 40);
        ProcessSimulation processSimulation12= new ProcessSimulation("P12", 11, true, 40);

        ProcessSimulation processSimulation13= new ProcessSimulation("P13", 10, false, 40);
        ProcessSimulation processSimulation14= new ProcessSimulation("P14", 6, true, 40);
        ProcessSimulation processSimulation15= new ProcessSimulation("P15", 10, false, 40);




        partitions.add(partition1);
        partitions.get(0).getProcessSimulations().add(processSimulation1);
        partitions.get(0).getProcessSimulations().add(processSimulation2);
        partitions.get(0).getProcessSimulations().add(processSimulation3);

        partitions.add(partition2);
        partitions.get(1).getProcessSimulations().add(processSimulation4);
        partitions.get(1).getProcessSimulations().add(processSimulation5);
        partitions.get(1).getProcessSimulations().add(processSimulation6);

        partitions.add(partition3);
        partitions.get(2).getProcessSimulations().add(processSimulation7);
        partitions.get(2).getProcessSimulations().add(processSimulation8);
        partitions.get(2).getProcessSimulations().add(processSimulation9);

        partitions.add(partition4);
        partitions.get(3).getProcessSimulations().add(processSimulation10);
        partitions.get(3).getProcessSimulations().add(processSimulation11);
        partitions.get(3).getProcessSimulations().add(processSimulation12);

        partitions.add(partition5);
        partitions.get(4).getProcessSimulations().add(processSimulation13);
        partitions.get(4).getProcessSimulations().add(processSimulation14);
        partitions.get(4).getProcessSimulations().add(processSimulation15);

        ManagerSimulation managerSimulation= new ManagerSimulation(partitions, 5);
        System.out.println(managerSimulation.startSimulation());



       /* ArrayList<Partition> partitionsPruebasSize= new ArrayList<>();
        Partition partition= new Partition("prueba", 100);
        Partition partitionUno= new Partition("prueba", 50);
        Partition partitionDos= new Partition("prueba", 30);
        partitionsPruebasSize.add(partition);
        partitionsPruebasSize.add(partitionUno);
        partitionsPruebasSize.add(partitionDos);

        ProcessSimulation processSimulation20= new ProcessSimulation("P7", 4, false, 40);
        ProcessSimulation processSimulation21= new ProcessSimulation("P8", 12, false, 40);
        ProcessSimulation processSimulation22= new ProcessSimulation("P9", 21, false, 40);

        ProcessSimulation processSimulation23= new ProcessSimulation("P10", 15, true, 40);
        ProcessSimulation processSimulation24= new ProcessSimulation("P11", 10, true, 40);
        ProcessSimulation processSimulation25= new ProcessSimulation("P12", 11, true, 40);

        ProcessSimulation processSimulation26= new ProcessSimulation("P13", 10, false, 40);
        ProcessSimulation processSimulation27= new ProcessSimulation("P14", 6, true, 40);
        ProcessSimulation processSimulation28= new ProcessSimulation("P15", 10, false, 40);

        for (Partition aux: partitionsPruebasSize) {
            if ()
        }
        partition.getProcessSimulations().add(processSimulation1);
        partition.setPartitionSize(partition.getPartitionSize()-partition.getProcessSimulations().get(0).getSize());
        System.out.println(partition.getPartitionSize());
        */

    }
}
