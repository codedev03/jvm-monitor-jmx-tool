# JVM Monitor JMX Tool

A lightweight Java-based monitoring tool to inspect heap memory, threads, and garbage collection stats using Java Management Extensions (JMX).

## 🔧 Features

- Monitors:
  - Heap memory usage
  - Active threads
  - Garbage collection count and time

## 🚀 Run
javac com/example/monitor/*.java
java com.example.monitor.Main

## Sample Output

Heap Memory Used: 32 MB / 2548 MB
Live Threads: 9
GC [G1 Young Generation] - Collections: 3, Time: 17 ms



## Technologies

- Java 17
- JMX (MemoryMXBean, ThreadMXBean, GarbageCollectorMXBean)
