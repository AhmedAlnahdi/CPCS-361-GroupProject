public class Process {

    // ====== Basic Attributes ======
    private int processId;
    private int arrivalTime;
    private int burstTime;
    private int remainingTime;
    private int memoryRequired;
    private int devicesRequired;
    private int priority;

    // ====== Statistics ======
    private int waitingTime;
    private int turnaroundTime;
    private int finishTime;

    // ====== Constructors ======
    public Process(int processId, int arrivalTime, int burstTime,
                   int memoryRequired, int devicesRequired, int priority) {
        this.processId = processId;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.memoryRequired = memoryRequired;
        this.devicesRequired = devicesRequired;
        this.priority = priority;
    }

    // ====== Getters and Setters ======
    public int getProcessId() { return processId; }
    public int getArrivalTime() { return arrivalTime; }
    public int getBurstTime() { return burstTime; }
    public int getRemainingTime() { return remainingTime; }
    public int getMemoryRequired() { return memoryRequired; }
    public int getDevicesRequired() { return devicesRequired; }
    public int getPriority() { return priority; }

    public void setRemainingTime(int remainingTime) { this.remainingTime = remainingTime; }
    public void setWaitingTime(int waitingTime) { this.waitingTime = waitingTime; }
    public void setTurnaroundTime(int turnaroundTime) { this.turnaroundTime = turnaroundTime; }
    public void setFinishTime(int finishTime) { this.finishTime = finishTime; }

    public int getWaitingTime() { return waitingTime; }
    public int getTurnaroundTime() { return turnaroundTime; }
    public int getFinishTime() { return finishTime; }

    // ====== Placeholder Methods ======
    public boolean isFinished() { return false; }
    public void reduceRemainingTime(int time) { /* placeholder */ }

    @Override
    public String toString() {
        return "Process " + processId + " [Remaining=" + remainingTime + "]";
    }
}
