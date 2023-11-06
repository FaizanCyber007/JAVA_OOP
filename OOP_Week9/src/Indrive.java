public class Indrive {

    public void addTaxi(Taxi[] taxis) {
        for(int i=0; i<taxis.length; i++) {
            if(taxis[i] == null) {
                taxis[i] = new Taxi();
            }
        }


    }
    public static<T,V> Taxi findNearestTaxi(Taxi[] taxis, Person person) {
        Taxi t = null;
        double min = Math.sqrt(Math.pow(taxis[0].locationX - person.personLocationX, 2) + Math.pow(taxis[0].locationY - person.personLocationY, 2));
        for(int i = 0; i<taxis.length; i++) {
            if(taxis[i] != null) {
                double distance = Math.sqrt(Math.pow(taxis[i].locationX - person.personLocationX, 2) + Math.pow(taxis[i].locationY - person.personLocationY, 2));
                if(distance<= min) {
                min = distance;
                t = taxis[i];
            }
            }
        }
       // System.out.println("The fare is: " +t.calculateFare(min));
        return t;
    }
}
