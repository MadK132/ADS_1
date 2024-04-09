import java.rmi.UnexpectedException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean s = false;
        Scanner scanner = new Scanner(System.in);
        while(!s){
            System.out.println("Write number of task you need(1-10)");
            int task = scanner.nextInt();
            if(task==1){
                System.out.println("Write size of your array:");
                int n = scanner.nextInt();
                int[] array = new int[n];
                System.out.println("Write every element of array");
                for (int i = 0; i < n; i++) {
                    array[i] = scanner.nextInt();
                }
                int min = Task1.findMinimum(array);
                System.out.println("Minimum in this array is" + " " + min);
            }
            else if(task==2){
            }
        }
    }
}