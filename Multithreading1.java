class Multithreading1 extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // create thread object
        t1.start(); // start thread, calls run()
    }
}
