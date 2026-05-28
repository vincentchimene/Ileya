public class ZeroMover {

    public static int[] moveZeros(int[] array) {

        int[] result = new int[array.length];

        int position = 0;

        for (int index = 0; index < array.length; index++) {

            if (array[index] != 0) {
                result[position] = array[index];
                position++;
            }
        }

        return result;
    }

