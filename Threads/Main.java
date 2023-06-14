package kondarishi1206.Threads;

public class Main {
    public static void main(String[] args) {
        threadImp thread1 = new threadImp();

        runnableImpl runnable = new runnableImpl();
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();
    }
}
