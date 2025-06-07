package com.example.monitor;

import java.lang.management.*;

public class JVMMetrics {

    public static void printHeapUsage() {
        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
        MemoryUsage heap = memoryMXBean.getHeapMemoryUsage();
        System.out.printf("Heap Memory Used: %d MB / %d MB%n",
                heap.getUsed() / (1024 * 1024),
                heap.getMax() / (1024 * 1024));
    }

    public static void printThreadInfo() {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        int threadCount = threadMXBean.getThreadCount();
        System.out.println("Live Threads: " + threadCount);
    }

    public static void printGCStats() {
        for (GarbageCollectorMXBean gc : ManagementFactory.getGarbageCollectorMXBeans()) {
            System.out.printf("GC [%s] - Collections: %d, Time: %d ms%n",
                    gc.getName(), gc.getCollectionCount(), gc.getCollectionTime());
        }
    }
}
