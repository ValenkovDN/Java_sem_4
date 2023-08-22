import java.util.Random;
import java.util.Scanner;
public class Sem_task_1 {
    static Random random = new Random();
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите размер массива: ");
        int num = in.nextInt();
        wrhitemas(mass(num));
    }

    public static int[] mass(int a){
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0,11);
        }
        return array;
    }

    public static void wrhitemas(int[] ar){
        for (int i = 0; i < ar.length; i++)
            if (i != ar.length -1) {
                System.out.print(ar[i] + ", ");
            }
            else {
                System.out.print(ar[i] + ";");
            }
        }
    }
