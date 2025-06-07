public class Main {
    public static void main(String[] args) {
        System.out.println("JVM Monitor Tool Started...");

        // Simulate memory usage
        List<byte[]> memoryWaster = new ArrayList<>();

        // Start some threads to simulate load
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                while (true) {
                    // idle loop
                }
            }).start();
        }

        while (true) {
            System.out.println("=== JVM Stats ===");
            JVMMetrics.printHeapUsage();
            JVMMetrics.printThreadInfo();
            JVMMetrics.printGCStats();
            System.out.println("=================\n");

            // simulate memory pressure
            memoryWaster.add(new byte[5 * 1024 * 1024]); // add 5MB
            if (memoryWaster.size() > 50) memoryWaster.clear();

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
