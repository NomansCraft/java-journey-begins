package noman.love.java.chapter5.exercises;

public class ArrayComparator {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 7};
        int[] array2 = {1, 2, 3, 6};

        System.out.println(isEqual(array, array2));
    }

    public static boolean isEqual(int[] array, int[] array2) {
        int firstArrayLength = array.length;
        int secondArrayLength = array2.length;

        int count = 0;

        if (firstArrayLength == secondArrayLength) {
            for (int i = 0; i < firstArrayLength; i++) {
                if (array[i] == array2[i]) {
                    count++;
                }
            }

            if (firstArrayLength == count && secondArrayLength == count) {
                return true;
            }
        }
        return false;
    }
}
