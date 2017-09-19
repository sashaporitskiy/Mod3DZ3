import java.util.Scanner;

public class Mod3DZ3Zad1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите размер массива");
        int r = in.nextInt();
        int[] lis = new int[r];

        //введите  массив
        GetArr(lis,r,in);
        //Вывод массива
        SetArr(lis);

        //вывод миниматоного значения массива
        System.out.println("Результат поиск минимального значения массива = "+ SearchArrMin(lis));

        //вывод макимального значения массива
        System.out.println("Результат поиск максимального значения массива = "+ SearchArrMax(lis));

        //вывод количества повторений числа 5
        System.out.println("Результат поиска колличества повторений чиса 5 = "+ SearchFive(lis));

        //сортировка методом пузырька
        SortArr(lis);

        //Вывод массива после сортировки
        SetArr(lis);

        //вывести в консоль максимальное кол-во повторений чисел в массиве
        PovtorNumbermax(lis);

    }
    //Ввод элементов массива
    public static void GetArr(int[] Arr,int raz,Scanner in){
        for (int i =0;i<raz;i++) {
            System.out.println("введите значение элемента массива "+i);
            Arr[i]=in.nextInt();
        }
    }
    //Вывод элементов массива
    public static void SetArr(int[] Arr){
        System.out.print("введенный масив { ");
        for (int i :Arr) {
            System.out.print(i+", ");
        }
        System.out.println(" } ");
    }

    //Поиск минимального значения массива
    public static  int SearchArrMin(int[] Arr){
        System.out.println("поиск минимального значение массива");
        int min  = Arr[0];
        for (int i =0;i<Arr.length;i++) {
            if (Arr[i]<min) {
                min = Arr[i];
            }
        }
        return min;
    }

    //Поиск Максимального значения массива
    public static  int SearchArrMax(int[] Arr){
        System.out.println("поиск максимального значение массива");
        int max  = Arr[0];
        for (int i =0;i<Arr.length;i++) {
            if (Arr[i]>max) {
                max = Arr[i];
            }
        }
        return max;
    }

    //Повывод количества повторений числа 5
    public static  int SearchFive(int[] Arr){
        int maxf =0;
        int m =5;
        for (int i =0;i<Arr.length;i++) {

            if (Arr[i]==m) {
                maxf = maxf+1;
            }
        }
        return maxf;
    }

    //сортирвка методом пузырька
    public static void SortArr(int[] Arr){
        System.out.println("Сортировка методом пузырька");
        for (int i = Arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (Arr[j] > Arr[j + 1]) {
                    int t = Arr[j];
                    Arr[j] = Arr[j + 1];
                    Arr[j + 1] = t;
                }
            }
        }
    }
    //вывести в консоль максимальное кол-во повторений чисел в массиве
    public static void PovtorNumbermax(int[] Arr){
        int kolPovtorov =0;
        int num = 0;
        int kolPov=0;
        for (int i =0;i<Arr.length;i++) {
            if (kolPov > kolPovtorov){
                if (num != Arr[i]) {
                    kolPovtorov = kolPov;
                    num = Arr[i-1];
                }
            }
            kolPov=0;
            for (int j =0;j<Arr.length;j++) {
                if (Arr[i]==Arr[j]) {
                    kolPov ++;
                }
            }
        }
        System.out.println("максимальное кол-во повторений чисел в массиве = "+kolPovtorov+" числа ->"+ num);
    }

}
