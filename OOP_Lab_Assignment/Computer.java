public class Computer {
    String computerNumber;
    private String lcdModel;
    private int ramSize;
    private int hddSize;
    private boolean hasGPU;

    Computer() {
        
    }
    Computer(String computerNumber, String lcdModel, int ramSize, int hddSize, boolean hasGPU) {
        this.computerNumber = computerNumber;
        this.hasGPU = hasGPU;
        this.hddSize = hddSize;
        this.lcdModel = lcdModel;
        this.ramSize = ramSize;
    }
    public void setHasGPU(boolean hasGPU) {
        this.hasGPU = hasGPU;
    }
    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }
    public void setLcdModel(String lcdModel) {
        this.lcdModel = lcdModel;
    }
    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }
    public int getHddSize() {
        return hddSize;
    }
    public String getLcdModel() {
        return lcdModel;
    }
    public int getRamSize() {
        return ramSize;
    }
    public String getComputerNumber() {
        return computerNumber;
    }
    public void setComputerNumber(String computerNumber) {
        this.computerNumber = computerNumber;
    }
    public boolean equals(Object o) {
        Computer temp = (Computer)o;
        return this.computerNumber==temp.computerNumber ? true: false;
    }

    public Computer clone(Computer c) {
        return new Computer(c.computerNumber, c.lcdModel, c.ramSize, c.hddSize, c.hasGPU);
    }
}