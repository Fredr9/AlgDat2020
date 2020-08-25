public class ForelesningsTrær {
    public static void main(String[] args) {
        int [] a  = { 4,5, 5,6};
        int begin = 0;
        for(int i = begin; i > 0; --i){
            int id = i;
            int left = 2 * id;
            int right = 2 * id + 1;
            if(a[left] > a[right]){
                a[id] = a[left];
            }
            else{
                a[id] = a[right];
            }

        }
    }
}
