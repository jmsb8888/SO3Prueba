package models;

import java.util.ArrayList;

public class ManagerProcess {
    private int simulatorTime;
    private int tamañoParticion;
    private ArrayList<ProcessSimulation> processSimulationList;
    private ArrayList<FormatReport> listo;
    private ArrayList<FormatReport> despachar;
    private ArrayList<FormatReport> ejecucion;
    private ArrayList<FormatReport> expTiempo;
    private ArrayList<FormatReport> bloqueado;
    private ArrayList<FormatReport> bloquear;
    private ArrayList<FormatReport> despertar;
    private ArrayList<FormatReport> salida;
    private ArrayList<FormatReport> tamañoDemasiadoGrande;



    public ManagerProcess(int simulatorTime, ArrayList<ProcessSimulation> processSimulationList, int tamañoParticion) {
        this.simulatorTime = simulatorTime;
        this.processSimulationList = processSimulationList;
        listo = new ArrayList<>();
        despachar = new ArrayList<>();
        ejecucion = new ArrayList<>();
        expTiempo = new ArrayList<>();
        bloqueado = new ArrayList<>();
        bloquear = new ArrayList<>();
        despertar = new ArrayList<>();
        salida= new ArrayList<>();
        tamañoDemasiadoGrande= new ArrayList<>();
        this.tamañoParticion= tamañoParticion;
    }
    public String getProcessList() {
        String processListReport = "";
        for (FormatReport processSimulation : listo) {
            processListReport += processSimulation.toString();
        }
        return processListReport;
    }
    public String getdespachar() {
        String processListReport = "";
        for (FormatReport processSimulation : despachar) {
            processListReport += processSimulation.toString();
        }
        return processListReport;
    }
    public String getExpTiempo() {
        String processListReport = "";
        for (FormatReport processSimulation : expTiempo) {
            processListReport += processSimulation.toString();
        }
        return processListReport;
    }
    public String getEjecucion() {
        String processListReport = "";
        for (FormatReport processSimulation :ejecucion ) {
            processListReport += processSimulation.toString();
        }
        return processListReport;
    }
    public String getBloqueado() {
        String processListReport = "";
        for (FormatReport processSimulation : bloqueado) {
            processListReport += processSimulation.toString();
        }
        return processListReport;
    }
    public String getBloquear() {
        String processListReport = "";
        for (FormatReport processSimulation : bloquear) {
            processListReport += processSimulation.toString();
        }
        return processListReport;
    }
    public String getDespertar() {
        String processListReport = "";
        for (FormatReport processSimulation : despertar) {
            processListReport += processSimulation.toString();
        }
        return processListReport;
    }
    public String getSalida() {
        String processListReport = "";
        for (FormatReport processSimulation : salida) {
            processListReport += processSimulation.getName()+"\n";
        }
        return processListReport;
    }
    public String getTamañoDemasiadoGrande() {
        String processListReport = "";
        for (FormatReport processSimulation : tamañoDemasiadoGrande) {
            processListReport += processSimulation.getName()+"\n";
        }
        return processListReport;
    }
    public String reportFinal (){
        String report="";
        report = "\n*********************  LISTA DE PROCESOS EN ESTADO DE LISTO: ********************\n";
        report += "Nombre        Tiempo \n";
        report+=getProcessList();
        report += "\n\n\n*************************** LISTA DE PROCESOS SALIENTES: *****************************\n";
        report += "Nombre \n";
        report+=getSalida();
        report+="\n\n\n************** LISTA DE PROCESOS EN TRANSICION DE DESPACHAR: ***************\n";
        report += "Nombre        Tiempo \n";
        report+= getdespachar();
        report+= "\n\n\n****************** LISTA DE PROCESOS EN ESTADO DE EJECUCION: *****************\n";
        report += "Nombre        Tiempo \n";
        report+= getEjecucion();
        report+="\n\n\n*********** LISTA DE PROCESOS EN TRANSICION DE TIEMPO EXPIRADO: **********\n";
        report += "Nombre        Tiempo \n";
        report+= getExpTiempo();
        report+="\n\n\n************* LISTA DE PROCESOS EN TRANSICION BLOQUEADO: ****************\n";
        report += "Nombre        Tiempo \n";
        report += getBloqueado();
        report+="\n\n\n******************* LISTA DE PROCESOS EN ESTADO DE BLOQUEAR: *****************\n";
        report += "Nombre        Tiempo \n";
        report += getBloquear();
        report+="\n\n\n********** LISTA DE PROCESOS EN TRANSICION DE DESPERTAR: *********\n";
        report += "Nombre        Tiempo \n";
        report+= getDespertar();
        report+="\n\n\n******* LISTA DE PROCESOS CUYO TAMAÑO ES DEMASIADO GRANDE: *******\n";
        report += "Nombre        Tiempo \n";
        report+= getTamañoDemasiadoGrande();

        return report;
    }

    public String startSimulation(){
   /* for (int i = 0; i < processSimulationListSimulation.size(); i++) {
        listo.add(new FormatReport(processSimulationListSimulation.get(i).getNameOfProcess(), processSimulationListSimulation.get(i).getProcessExecutionTime()));
    }*/
        while(processSimulationList.size()>0){
            iterations();
        }

        return reportFinal();
    }

    public void iterations(){
       /* int in = 0;
        ArrayList<ProcessSimulation> auxiliar= new ArrayList<>(processSimulationListSimulation);

        for (int i = in; i < processSimulationListSimulation.size(); i++) {
            if(processSimulationListSimulation.get(i).getProcessExecutionTime()>0) {
                ProcessSimulation aux = processSimulationListSimulation.get(i);
               // aux.setProcessExecutionTime(aux.getProcessExecutionTime() - simulatorTime);
                if(aux.getProcessExecutionTime()>0){
                    defineRoute(processSimulationListSimulation.get(i),i);
                    processSimulationListSimulation.set(i, aux);
                }

                if(aux.getProcessExecutionTime()<=0){
                    salida.add(new FormatReport(processSimulationListSimulation.get(i).getNameOfProcess(), processSimulationListSimulation.get(i).getProcessExecutionTime()));
                    processSimulationListSimulation.remove(i);
                    i--;
                }
            }
        }*/

        ArrayList<ProcessSimulation> auxiliar= new ArrayList<>(processSimulationList);
        int i=0;
        while (i < processSimulationList.size()) {
            if (processSimulationList.get(i).getSize() <= tamañoParticion) {
                if (processSimulationList.get(i).getTime() > 0) {
                    ProcessSimulation aux = processSimulationList.get(i);
                    if (aux.getTime() > 0) {
                        defineRoute(processSimulationList.get(i), i);
                        processSimulationList.set(i, aux);
                    }
                    if (aux.getTime() <= 0) {
                        salida.add(new FormatReport(processSimulationList.get(i).getProcesName(), processSimulationList.get(i).getTime()));
                        processSimulationList.remove(i);
                        i--;
                    }
                }

            }else{
                tamañoDemasiadoGrande.add(new FormatReport(processSimulationList.get(i).getProcesName(), processSimulationList.get(i).getTime()));
                processSimulationList.remove(i);
                i--;
            }
            i++;
        }

    }

    public void defineRoute(ProcessSimulation processSimulation, int count){
        if(processSimulation.isBlock()==false){
            listo.add(new FormatReport(processSimulation.getProcesName(), processSimulation.getTime()));
            despachar.add(new FormatReport(processSimulation.getProcesName(), processSimulation.getTime()));
            ProcessSimulation aux = processSimulationList.get(count);
            aux.setTime(aux.getTime() - simulatorTime);
            if(processSimulation.getTime()>0){
                ejecucion.add(new FormatReport(processSimulation.getProcesName(), processSimulation.getTime()));
                expTiempo.add(new FormatReport(processSimulation.getProcesName(), processSimulation.getTime()));
            }
        }else if(processSimulation.isBlock()==true){
            listo.add(new FormatReport(processSimulation.getProcesName(), processSimulation.getTime()));
            despachar.add(new FormatReport(processSimulation.getProcesName(), processSimulation.getTime()));
            ProcessSimulation aux = processSimulationList.get(count);
            aux.setTime(aux.getTime() - simulatorTime);
            if(processSimulation.getTime()>0){
                ejecucion.add(new FormatReport(processSimulation.getProcesName(), processSimulation.getTime()));
                bloqueado.add(new FormatReport(processSimulation.getProcesName(), processSimulation.getTime()));
                bloquear.add(new FormatReport(processSimulation.getProcesName(), processSimulation.getTime()));
                despertar.add(new FormatReport(processSimulation.getProcesName(), processSimulation.getTime()));
            }

        }
    }
}
