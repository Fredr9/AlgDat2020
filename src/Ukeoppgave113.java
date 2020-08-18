

public class Ukeoppgave113 {
    public static void main(String[] args) {
        int[] a = {8, 4};

        System.out.println(minmaks(a));
    }

         static int[] minmaks(int[] a)
        {
            int mi = 0, minverdi = a[0];
            int ma = 0, maksverdi = a[0];

            int verdi = 0;



            for (int i = 1; i < a.length; i++)
            {
                verdi = a[i];

                if (verdi > maksverdi) { maksverdi = verdi; ma = i;}
                else if (verdi < minverdi) {minverdi = verdi; mi = i;}
            }

            return new int[]{mi,ma};

        }

    }

