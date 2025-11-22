package threads.basicRaceCondition;

public class ThreadActionImpl implements Runnable {

    ShareResourceSimulation resource;
    String threadName;

    // To use the same resource we need to give threads the resource via constructor
    // otherwise it won't realize it is a shared one
    public ThreadActionImpl(ShareResourceSimulation resource, String threadName) {
        this.resource = resource;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10_000; i++) {
            resource.increaseNumber();
            System.out.println(threadName + ": " + resource.getValueOfNumber());
        }
    }
}
