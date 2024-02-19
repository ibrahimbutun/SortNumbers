import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("dizi uzunluğunu giriniz: ");
        int arrayLenght = input.nextInt();
        int[] array = new int[arrayLenght];

        System.out.println("sayı giriniz : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + 1 + ". eleman: ");
            int val = input.nextInt();
            array[i] = val;
        }

        Arrays.sort(array);
        System.out.println("Sıralanmış dizi : " + Arrays.toString(array));
        input.close();

    }
}
