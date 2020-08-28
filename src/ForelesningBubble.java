public class ForelesningBubble {
    public static void main(String[] args) {
        int[] a = {1, 91, 2, 4, 7, 6,3,14,12};

        bubble(a);
        // Forklaring av foreach løkke
        // for( int = 0; i < a.length; ++i){
        // k = a[i] }
        for (int k : a) {
            System.out.print(k + ", ");

        }


    }

    static void bubble(int[] a) {
        int begin = 0;
        int end = a.length - 1;

        for (int i = begin; i < end; ++i) {
            if (a[i] > a[i + 1]) {
                // BYTT - vi har funnet en inversjon!
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            } else {

            }
            System.out.print(a[0]);
            for (int j = 1; j < a.length; ++j) {
                System.out.print(", " + a[j] );

            }
            System.out.println();
        }
        System.out.println("det største tallet er: "+ a[end]) ;
    }


}
