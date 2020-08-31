public class Forelesning3108 {
    public static void main(String[] args) {
        int[] a = {9, 3, 2, 7, 4};
        int[] b = {2, 3, 4, 7, 8};
        int[] c = {2, 3, 4, 7, 9};
        int [] d = {2,3,4,7,9};


    }


     public int usortetSok(int[] a, int value) {
        for (int i = 0; i < a.length; ++i) {
            if (a[i] == value) {
                return i;
            }
        }

        return -1;
    }





    int sortertSok(int[] b, int verdi) {
        for (int i = 0; i < b.length; ++i) {
            if (b[i] == verdi) {
                return i;
            }
        }
        return -1;
    }



    int sortertSok2(int[] c, int verdi2) {
        int steg_lengde = 2;
        for (int i = 0; i < c.length; i = i + steg_lengde) {
            if (c[i] <= verdi2) {
                int begin = i - steg_lengde;
                int end = i + 1;
                for(int j = begin; j < end; ++j){
                    if(c[j]== verdi2){
                        return j;
                    }
                }
                return -1;
            }
        }
    return -1;
    }



   // int binaerSok();
}
