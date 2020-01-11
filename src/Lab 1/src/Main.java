public class Main {
    public static void main(String[] args) {
        Integer[] array = {-1, -2, -3, -4, -5, 1, 1, 1, 1, 1, 1, -2, 0, -8, 0, 6, -5, 0, 3, 2, 0, 1, 2, 3, 4, 56, 7};
//        Integer[] array = {0, 5, -6, 0, 6, -5, 0, 3, 2, 0};
//        Integer[] array = {0, -5, 5, 0, -6, -5, -8, 3, 2, 0};
//        Integer[] array = {1, 1, 1, -1, 1, 0, -1, 1, 0, -1, 1, 0, -1, 1, 0};
        int zeros = 0;
        int pluses = array.length - 1;
        int cycles = 0;

        for (int i = 1; i <= pluses; ++i) {
            if (array[i] > 0) {
                /*int tmp = array[pluses];
                array[pluses] = array[i];
                array[i] = tmp;*/
                swap(array, pluses, i);

                --pluses;
                --i;
            }

            if (array[i] == 0) {
                /*int tmp = array[zeros];
                array[zeros] = array[i];
                array[i] = tmp;*/
                swap(array, zeros, i);

                ++zeros;
            }

            ++cycles;
        }

        System.out.print("\nResult: {" + array[0]);
        for (int i = 1; i < array.length; ++i)
            System.out.print(", " + array[i]);
        System.out.println("}");

        System.out.println("Cycles: " + cycles);
    }

    private static void swap(Integer[] array, Integer a, Integer b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}
