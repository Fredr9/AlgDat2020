public class Ukeoppgaver114 {
    public static void main(String[] args) {
       // I den første
        int[] a = {10, 5, 7, 2, 9, 1, 3, 8, 4, 6};
        System.out.println(a[maks(a)]);

    }
        public static int maks( int[] a)   // versjon 2 av maks-metoden
        {
            int m = 0;               // indeks til største verdi
            int maksverdi = a[0];    // største verdi

            for (int i = 1; i < a.length; i++)
                if (a[i] > maksverdi) {
                    maksverdi = a[i];     // største verdi oppdateres
                    m = i;                // indeks til største verdi oppdateres
                }
            return m;   // returnerer indeks/posisjonen til største verdi

        } // maks
    }

