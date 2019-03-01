package practice1.ex3;

public class Program3 {
    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        int tmp = 0;
        for (int i = 0; i <= length-1; i++)
        {
            for (int j = length-1; j > i; j--)
            {
                if (array[j] < array[j - 1])
                {

                    tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
            }
        }
        }
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
