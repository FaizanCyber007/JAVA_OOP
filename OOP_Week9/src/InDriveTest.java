public class InDriveTest {
    public static void main(String[] args) {
        Taxi[] taxiCollection = new Taxi[10];
        taxiCollection[1] = new Taxi(10,20,"Available", 1);
        taxiCollection[0] = new Taxi(7,3,"Available", 2);
        taxiCollection[3] = new Taxi(6,1,"Available", 3);
        taxiCollection[4] = new Taxi(3,2,"Available", 3);

        Person p1 = new Person(2,5);
        Taxi t = Indrive.<Taxi, Person>findNearestTaxi(taxiCollection, p1);
        System.out.println(t);
    }
}
