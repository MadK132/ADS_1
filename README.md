Public class main{} 
We save here values in scanner for some calculation
I added something like console to pick(choose) task we need to solve, with it's own input (without inputted values)
Here "boolean s" work as motor, program will work until it's false
After each task i added that it will be true to finish the program
In each task we call functions with it's return type (exception in task 7)
In task 7 we need void type function, because firstly we need to change order and make it reverse, and then in the Main.java we print out array with changed order
In each task we just save in the scanner array,numbers,booleans to work with tasks


Task1:
static int findMinimum(int[] arr)
We create a minimum as it's first element and then compare with others
Task2:
static float findaverage(int[] arr)
We summarize elements in the array (int sum) and just divide it by it length and get average
Task3:
static boolean Prime(int n)
If the number is equal to 1 it's not prime (make some exception)
Initially it's true that it's prime and in condition it will be divided not itself, it will be composite number
Task4:
static int Factorial(int n)
We take exception as n==0, because when it's 0, factorial of this will be equal to 1
After this we write recursion in which it will multiply until the end (from n to 1)
Task5:
static int Fib(int n)
Fibonacci numbers sequence is combining the previous number to the next
We make exception, because this sequence cover only numbers from 1
Task6:
static int Pow(int a, int n)
We need result number where a is in the power of n
So to make this by recursion, we multiply a until it will return 1
Task7:
static void reverse(int[] arr,int start,int n)
To make array reverse without array data structure, we pick it start and the end and just change order each time
for example we change the first element of array with the last
Task8:
static boolean check(String s)
We need to functions here to not write a huge code.
To check whether string consist of only digit or not, we must check each of its element
Task9:
static int BinCoef(int k, int n)
Simple task by the formula you gave us, just by conditions in the task info we get solution
Task10:
static int GCD(int a, int b)
By Eucledian Algorithm we work with remainder of number
In case b==0 it will return a

