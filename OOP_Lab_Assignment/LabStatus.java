public enum LabStatus {
    OPERATIONAL(1), FAULTY_MULTIMEDIA(2);
    public final int value;

    LabStatus(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
