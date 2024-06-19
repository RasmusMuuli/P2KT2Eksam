/**
 * Õpilase nimi: Rasmus Muuli
 * Programmeerimine 2 - Eksamiosa 2 19.06.2024.
 */

//Lisan kommentaarid khoe koju jõudes, kui sobib, arvti klaviatuuri osad klahvid ei tööta korraliklt,
//võtaks väga kaua aega, siin arvtis.
public class E2 {

    //Siin meetodis kutsun välja abimeetodi, kus rakendan rekursiooni.
    //Argumendiks võtan arvumassiivi a, mida hakkan hindama
    public static boolean kasVahelduv(int[] a) {
        return kasVahelduvRek(a, 0);

    }
    //Rekursioonimeetodis võtan argumentideks massiivi a ning indeksi i,
    //mis hakkab tähistama elementi massiivis, mille juures ma parasjagu olen
    public static boolean kasVahelduvRek(int[] a, int i) {
        //Baasjuht
        //Kuni eelviimase liikmeni, et saaks kontrollida sellest eelnevat ja järgnevat
        if (i>= a.length -2) return true;

        //if ((a[i] <= a[i+1] && a[i+1] <=a[i+2]) &&
        //        (a[i] >= a[i+1] && a[i+1] >=a[i+2]))   return true;
        //Kontrollin, kas ülesandes sõnastatud tingimusi ja nõudeid rikutakse
        if ((a[i] < a[i+1] && a[i+1] <=a[i+2]) ||
                (a[i] > a[i+1] && a[i+1] >=a[i+2]))   return false;

            //else if (a[i] < a[i+1] && a[i+1] >=a[i+2] && a[i] > a[i+1] && a[i+1] <=a[i+2]) return true;
            //else if (a[i] > a[i+1] && a[i+1] <=a[i+2]) return true;
            //Rakendan rekursiooni
        else return kasVahelduvRek(a , i+1);
    }

    public static void põimi(int[] a, int[] b) {
        throw new UnsupportedOperationException();
    }

    public static int kasvavadOsajärjendid(int[] a) {
        throw new UnsupportedOperationException();
    }
    public static void main(String[] args) {
        int[] a = {7,7,8,8};
        int[] b = {1,5,2,8,5};
        int[] d = {1,5,2,8,5,3,10,2};
        System.out.println(kasVahelduv(b));
    }
}