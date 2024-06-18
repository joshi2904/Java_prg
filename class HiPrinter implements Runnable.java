Using two threads and runnable method create program and print hi message 
 =>class HiPrinter implements Runnable {
    private String message;
    
    public HiPrinter(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        // Create instances of HiPrinter with the message "hi"
        HiPrinter hiPrinter1 = new HiPrinter("hi from thread 1");
        HiPrinter hiPrinter2 = new HiPrinter("hi from thread 2");

        // Create threads with the HiPrinter instances
        Thread thread1 = new Thread(hiPrinter1);
        Thread thread2 = new Thread(hiPrinter2);

        // Start the threads
        thread1.start();
        thread2.start();
        
        try {
            // Wait for the threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
        
        System.out.println("Both threads have finished execution.");
    }
}
