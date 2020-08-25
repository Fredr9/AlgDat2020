import static org.junit.jupiter.api.Assertions.*;

class Ukeoppgaver112Test {
        @org.junit.jupiter.api.Test
    void min(){
            int[] a = {8, 4, 17, 19, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 18, 20};

            int minimun = Ukeoppgaver112.min(a);

            assertEquals(6,minimun);
            assertEquals(1,a[minimun]);

            // Test for alle permmutasjoner for 4 tall.


            // Test corner cases - "Spesialtilfeller"
            int [] b = {1,4, 17, 10, 6, 20,8};
            assertEquals(0, Ukeoppgaver112.min(b));
            int [] c = {8 ,4, 17, 10, 6, 20,1};
            assertEquals(6, Ukeoppgaver112.min(c));
        }
}