package kondarishi1206.Threads;

public class runnableImpl implements Runnable {

    @Override
    public void run() {
        for(int i = 1; i < 11; i++) {
            System.out.println("Runnable - " +i);
        }
    }

}