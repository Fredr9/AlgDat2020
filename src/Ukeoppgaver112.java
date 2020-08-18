public class Ukeoppgaver112 {
    public static void main(String[] args) {

        int[] a = {8, 4, 17, 19, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 18, 20};

        int min_index = min(a);
        int maks_index = max(a);


        System.out.println(min_index);
        System.out.println(a[min_index]);

        System.out.println(maks_index);
        System.out.println(a[maks_index]);
    }

    static int min(int[] a) {
        // initialiser med første element
        int min_value = a[0];
        int min_index = 0;
        // Loop over alle resterende elementer og sjekker om vi finner
        // et mindre tall
        for (int i = 1; i < a.length; ++i) {
            int value = a[i];
            int index = i;

            if (value < min_value) {
                min_value = value;
                min_index = index;
            }
        }

        return min_index;


    }
    static int max (int[] a){

        int max_value = a[0];
        int max_index = 0;

        for(int i = 1; i < a.length; ++i){
            int maxValue = a[i];
            int maxIndex = i;

            // For å gjøre så maks-metoden returnerer posisjonen til den siste "like" største verdien
            // må man skrive >= slik at den bytter til siste mulige indeksposisjon når den treffer like verdier.
            if (maxValue >= max_value ){
                max_value = maxValue;
                max_index = maxIndex;
            }
        }
        return max_index;
    }
}

