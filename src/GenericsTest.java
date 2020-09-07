public class GenericsTest {
    public static void main(String[] args) {
        Integer[] a = {1, 3, 2, 6, 3, 2, 98};
        Character[] b = {'A', 'C', 'Y', 'M', 'Z'};
        String[] c = {"Jasså", "Hallo", "Såpass", "åååå", "AAA", "ÅÅÅÅååÅååAAsadsadsadsadasdsadsdadAA"};
        Person[] d = {new Person("Petter", "Pettersen"), new Person("Kari", "Pettersen"), new Person("Nils", "Abrahamsen"), new Person("Tor", "Toresen")};

        System.out.println(maksGeneric(a));

        System.out.println(maksGeneric(b));

        System.out.println(maksGeneric(c));


        System.out.println(maksGeneric(d));
    }

    public static class Person implements Comparable<Person> {
        String first_name;
        String last_name;

        Person(String first_name, String last_name) {
            this.first_name = first_name;
            this.last_name = last_name;
        }

        public int compareTo(Person other) {
            /*
             if (this.last.name < other.last_name){
             return -1;
             }
             else if (this.last.name == other.last_name){
             return 0;
             }
             else{
             return 1;
             }
             */
            int last_compare = this.last_name.compareTo(other.last_name);
            if (last_compare == 0) {
                return this.first_name.compareTo(other.first_name);
            } else {
                return last_compare;
            }
        }
    }

    static <T extends Comparable<? super T>> int maksGeneric(T[] values) {
        T current_max = values[0];
        int current_index = 0;

        for (int i = 1; i < values.length; ++i) {
            //  if(values[i] > current_max){
            if (values[i].compareTo(current_max) > 0) {
                current_max = values[i];
                current_index = i;
            }
        }
        return current_index;
    }
}
