import java.util.Scanner;

public class Mod3DZ3Zad1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите размер массива");
        int r = in.nextInt();
        int[] lis = new int[r];

        for (int i =0;i<r;i++) {
                System.out.println("введите значение элемента массива");
                lis[i]=in.nextInt();
            }

        System.out.print("введенный масив { ");
        for (int i :lis) {
            System.out.print(i+", ");
        }
        System.out.println(" } ");

        System.out.println("поиск минимального значение массива");
        int min  = lis[0];
        for (int i =0;i<lis.length;i++) {

            if (lis[i]<min) {
                min = lis[i];
            }
        }
        System.out.println("минимальное значение массива = "+ min);


        System.out.println("поиск максимального значение массива");
        int max  = lis[0];
        for (int i =0;i<lis.length;i++) {

            if (lis[i]>max) {
                max = lis[i];
            }
        }
        System.out.println("максималное значение массива = "+ max);

        System.out.println("поиск колличества повторений чиса 5");
        int maxf =0;
        int m =5;
        for (int i =0;i<lis.length;i++) {

            if (lis[i]==m) {
                maxf = maxf+1;
            }
        }
        System.out.println("количество повторений числа 5  = "+ maxf);

        System.out.println("Сортировка методом пузырька");
        for (int i = lis.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (lis[j] > lis[j + 1]) {
                    int t = lis[j];
                    lis[j] = lis[j + 1];
                    lis[j + 1] = t;
                }
            }
        }

        System.out.print("введенный масив { ");
        for (int i :lis) {
            System.out.print(i+", ");
        }
        System.out.println(" } ");
    }

}
