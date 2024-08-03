package noman.love.java.chapter5.exercises;

public class ArrayComparator {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 7};
        int[] array2 = {1, 2, 3, 6};

        System.out.println(isEqual(array, array2));
    }

    public static boolean isEqual(int[] array, int[] array2) {
        if (array == null || array2 == null) {
            return array == array2;
        }

        if (array.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] != array2[i]) {
                    return false;
            }
        }
        return true;
    }

}
