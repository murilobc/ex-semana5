package br.senai.ex01;

import java.lang.management.ManagementFactory;

public class Memoria {
    public static void main(String[] args) {
        long memoria = ((com.sun.management.OperatingSystemMXBean) ManagementFactory
                .getOperatingSystemMXBean()).getTotalMemorySize();
        long alocado = ((com.sun.management.OperatingSystemMXBean) ManagementFactory
                .getOperatingSystemMXBean()).getCommittedVirtualMemorySize();

        double totalMem = ((memoria / 1024D) / 1024D) / 1024D;
        double alocadoMem = ((alocado / 1024D) / 1024D) / 1024D;
        double livreMem = (((memoria - alocado) / 1024D) / 1024D) / 1024D;

        System.out.printf("SO: %s - %s", System.getProperty("os.name"), System.getProperty("os.version"));
        System.out.printf("%nmem. total: %.2fGb", totalMem);
        System.out.printf("%nmem. alocado: %.2fGb", alocadoMem);
        System.out.printf("%nmem. livre: %.2fGb", livreMem);
    }
}
