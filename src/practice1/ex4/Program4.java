package practice1.ex4;

public class Program4 {
    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        int a, j, step;
        int tmp;
        for (step = array.length / 2; step > 0; step /= 2)
            for (a = step; a < array.length; a++)
            {
                tmp = array[a];
                for (j = a; j >= step; j -= step)
                {
                    if (tmp < array[j - step])
                        array[j] = array[j - step];
                    else
                        break;
                }
                array[j] = tmp;
            }

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
