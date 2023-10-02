public class Lab {
    private String labID;
    private Computer[] computers;
    LabStatus status;
    Employee labAttendant;
    int maxComputer = 30;
    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }
    public Computer[] getComputers() {
        return computers;
    }

    Lab(String labID, Employee labAttendant, LabStatus status) {
        this.labID = labID;
        this.labAttendant = labAttendant;
        this.status = status;
    }
    Lab() {

    }

    public void addComputer(Computer computer) {
        for(int i=0; i < maxComputer; i++) {
            computers[i] = new Computer("001", "HD LCD", 8, 500, false );
        }
    }
    public boolean removeComputer(String computerNumber) {
        return computers[maxComputer--] == null? true: false;
    }
    public Computer getComputer(String computerNumber) {
        for(int i =0; i<maxComputer; i++) {
            if(this.computers[i].computerNumber == computerNumber) {
                return this.computers[i];
            }
        }
    }
}
