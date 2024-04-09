import java.util.Scanner;
/**
 * Creating Main.java for future compilation here
 * boolean s is necessary for cycle in which we will choose a task we need to solve
 * Creating a scanner for saving values there
 */
public class Main {

    public static void main(String[] args) {
        boolean s = false;
        Scanner scanner = new Scanner(System.in);
        while(!s){
            System.out.println("Write number of task you need(1-10)");
            int task = scanner.nextInt();
            /**
             * Creating console manager to make it easier to solve and choose tasks
             *
             *
             */
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
            /**Here and next tasks we just create array or numbers and call the functions as result
             * s = true is fully stopping the program
             *
             *
             */
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
                System.out.println("Write length of array");
                int n = scanner.nextInt();
                int[] array = new int[n];
                System.out.println("Write down elements of this array");
                for (int i = 0; i < n; i++) {
                    array[i] = scanner.nextInt();
                }
                Task7.reverse(array,0,n);
                for(int i = 0; i<n;i++){
                    System.out.print(array[i] + " ");
                }
                scanner.nextLine();
                s = true;
            }
            /**7th task is different from other because it in void type and it dont return anything
             *
             *
             *
             */
            else if(task==8){
                System.out.println("Write down a text");
                scanner.nextLine();
                String text = scanner.nextLine();
                if(Task8.check(text)==true){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
                s = true;
           }
            else if(task==9){
                System.out.println("Write numbers");
                int k = scanner.nextInt();
                int n = scanner.nextInt();
                System.out.println("Binomial coefficient is " + Task9.BinCoef(n,k));
                s = true;
            }
            else if(task==10){
                System.out.println("Write numbers");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println("GCD of these numbers is " + Task10.GCD(a,b));
                s = true;
            }
        }
    }
}