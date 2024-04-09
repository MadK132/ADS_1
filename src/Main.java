import java.rmi.UnexpectedException;
import java.sql.SQLOutput;
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
                s = true;
            }
            else if(task==2){
                System.out.println("Write size of your array:");
                int n = scanner.nextInt();
                int[] array = new int[n];
                System.out.println("Write every element of array");
                for (int i = 0; i < n; i++) {
                    array[i] = scanner.nextInt();
                }
                float avrg = Task2.findaverage(array);
                System.out.println("Average of this array is " + avrg);
                s = true;
            }
            else if(task==3){
                System.out.println("Write a number");
                int n = scanner.nextInt();
                boolean prime = Task3.Prime(n);
                if(prime==true){
                    System.out.println("Prime");
                }
                else{
                    System.out.println("Composite");
                    s = true;
                }
            }
            else if(task==4){
                System.out.println("Write a number");
                int n = scanner.nextInt();
                System.out.println(n + "! = " + Task4.Factorial(n));
                s = true;
            }
            else if(task==5){
                System.out.println("Write a number");
                int n = scanner.nextInt();
                System.out.println(Task5.Fib(n));
                s = true;
            }
            else if(task==6){
                System.out.println("Write a number");
                int a = scanner.nextInt();
                System.out.println("Write power of its");
                int n = scanner.nextInt();
                System.out.println("Result is " + Task6.Pow(a,n) );
                s = true;
            }
            else if(task==7){
                System.out.println();
            }
        }
    }
}