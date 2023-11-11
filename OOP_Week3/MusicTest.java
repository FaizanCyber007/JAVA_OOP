public class MusicTest {
    public static void main(String[] args) {
        Music m1 = new Music("Pehli Nazar Mein", "7min", "Classic", new Date(4,8,2010), new Singer("Atif Aslam", "Male", "Pakistani", new Date(3,4,2005)));
        Music m2 = new Music("Pehli Nazar Mein", "7min", "Classic", new Date(4,8,2010), new Singer("Atif Aslam", "Male", "Pakistani", new Date(3,4,2005)));

        System.out.println(m1.equals(m2));
         System.out.println(m1.getSinger());
         System.out.println();
         System.out.println(m1.getReleasDate());
         System.out.println();
         System.out.println(m1);
    }
}
