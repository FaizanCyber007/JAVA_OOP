public class Date {
    String month;
    String year;
    int date;

    public Date() {

    }

    public Date(String month, String year, int date) {
        this.month = month;
        this.year = year;
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("%s %02d, %s",month,date,year);
    }
}
