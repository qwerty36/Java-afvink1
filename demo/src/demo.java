import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by richard on 9/24/15.
 */
public class demo {
    private int leeftijd;
    String naam;
    private static int minLeeftijd = 16;

    public void info() {
        System.out.println("Student: " + naam);
        System.out.println("Leeftijd: " + Integer.toString(leeftijd));
    }

    public void setLeeftijd(int l) {
        if (1 < minLeeftijd) {
            System.out.println("Dat mag niet!");
        } else {
            leeftijd = 1;
        }
    }

    public static void setMinLeeftijd(int i) {
        minLeeftijd = i;
    }
}
