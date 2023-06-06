import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[]{1, 3, 4, 1, 5, 5};
        double sum = 0;
        for (int i = 0; i < myArray.length; i++)
            sum = sum + myArray[i];
        double average = sum / myArray.length;
        System.out.println("Cредная значение; " + average);

        int[] my_array = {1, 3, 4, 1, 5, 5,};

        for (int i = 0; i < my_array.length - 1; i++) {
            for (int j = i + 1; j < my_array.length; j++)

            {
                if ((my_array[i] == my_array[j]) && (i != j))
                {
                    System.out.println("Duplicate : " + my_array[j]);
                }
            }
        }
        int[] values = {1, 3, -6, 23, 14, 2};
        int x = 3;


        boolean found = Arrays.stream(values)
                .boxed()
                .collect(Collectors.toSet())
                .contains(x);


        System.out.println(found);


        int[] nums = {1, 3, -6, 23, 14, 2};
        int a = 23;


        found = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet())
                .contains(a);


        System.out.println(found);

        int[] array3 = {1, 3, -6, 23, 14, 2};
        int x1 = 23;
        int foundIndex = 0;
        boolean isFoundX = false;

        for (int i = 0; i < array3.length; i++) {
            if (array3[i] == x1) {
                foundIndex = i;
                isFoundX = true;
                break;
            }
        }
        if (isFoundX) {
            System.out.println("Найден индекс: " + foundIndex);
        } else {
            System.out.println("Не найдено");
        }


        int[] array4 = {34, 82, 29, 30, 25, 40, 32, 31, 35, 410, 7};
        int p = 2;
        int s = 6;
        int[] resultArray = new int[s - p + 1];
        int counter = 0;

        for (int i = p; i <= s; i++) {
            resultArray[counter] = array4[i];
            counter++;
        }

        for (int number : resultArray) {
            System.out.print(number + " ");



        





            }
        













