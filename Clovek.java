package politikauwu;
public class Clovek {
    String jmeno;
    String prijmeni;
    int vek;
    
    public void napisCislo7() {
        System.out.println("Sedm");
    }

    public String toString() {
        return jmeno + " " + prijmeni + " " + vek;
    }
    public void jeStarsi() {
        vek++;
        System.out.println(vek);
    }
    public boolean JsemPlnolety() {
            return true;
        }
    }

