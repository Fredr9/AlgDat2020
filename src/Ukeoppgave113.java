
import java.util.Arrays;

public class Ukeoppgave113 {
    public static void main(String[] args) {
        int[] a = {8, 4};

        System.out.println(fakultet(5));

        System.out.println(Arrays.toString(minmaks(a)));
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
            //
            return new int[] {mi,ma};

        }


        public static long fakultet(int n){

            if(n < 0) {
                throw new IllegalArgumentException("n < 0");
            }
                long fakultet = 1;

            for(int i = 2; i <= n; i++){
                fakultet *= i;
            }

         return fakultet;

        }

    }

