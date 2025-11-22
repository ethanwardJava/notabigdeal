package threads.basicRaceCondition;

public class ShareResourceSimulation {
    int number = 0;

    synchronized void increaseNumber() {
        number++;
    }

    Integer getValueOfNumber() {
        return number;
    }
}
