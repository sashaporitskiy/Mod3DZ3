import java.util.Scanner;

public class DopZad3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите размер массива");
        String line = in.nextLine();
        String[] numbers = line.split( " ");
        int[] lis = new int[numbers.length];
        for(int i=0;i<numbers.length;i++) {
            lis[i] = Integer.parseInt(numbers[i]);
        }
        System.out.print("введенный масив { ");
        for (int i :lis) {
            System.out.print(i+", ");
        }
        System.out.println(" } ");
    }
}
