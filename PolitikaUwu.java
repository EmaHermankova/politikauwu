package politikauwu;

public class PolitikaUwu {

    public static void main(String[] args) {
        
        Clovek[] arr = new Clovek[2];
        
        arr[0] = new Clovek();
        arr[0].jmeno = "Kei";
        arr[0].prijmeni = "Tsukishima";
        arr[0].vek = 19;
        
        arr[1] = new Clovek();
        arr[1].jmeno = "Tobio";
        arr[1].prijmeni = "Kageyama";
        arr[1].vek = 16;
     
        Clovek f;
        f = new Clovek();
        f.jmeno = "Petr";
        f.prijmeni = "Fiala";
        f.vek = 57;
        
        Clovek j;
        j = new Clovek();
        j.jmeno = "Marian";
        j.prijmeni = "Jurečka";
        j.vek = 40;
        
        Clovek v;
        v = new Clovek();
        v.jmeno = "Vlastimil";
        v.prijmeni = "Válek";
        v.vek = 61;
        
        Clovek g;
        g = new Clovek();
        g.jmeno = "Petr";
        g.prijmeni = "Gazdík";
        g.vek = 47;
        
        Clovek b;
        b = new Clovek();
        b.jmeno = "Ivan";
        b.prijmeni = "Bartoš";
        b.vek = 41;
        
        f.napisCislo7();
        String out = f.toString();
        System.out.println(out);
        System.out.println("Dobry den " + f);
        f.jeStarsi();
        for (int i =0; i < arr.length; i++) {
            if (arr[i].JsemPlnolety()){
            System.out.println(arr[i]);
            }   
        }
    }
}
