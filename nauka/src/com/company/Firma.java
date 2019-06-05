package com.company;
import java.util.ArrayList;
import java.util.List;

public class Firma {
    private static double totalSalaries = 0;
    private List<Worker> workers = new ArrayList<>();

    public Firma() {

    }

    public Firma(List<Worker> workers) {
        this.workers = workers;
        totalSalaries = workers.stream().mapToDouble(w -> w.getSalary()).sum();
    }

    public static double getTotalSalaries() {
        return totalSalaries;
    }

    public void addWorker(Worker worker) {
        workers.add(worker);
        totalSalaries += worker.getSalary();
    }

    @Override
    public String toString() {
        return "Firma{" +
                "workers= " + workers +
                "totalSalaries= " + totalSalaries +
                "}";
    }
}
