package ua.edu.uu.ikt.lab6;

public class Factorial {

    public static int factorial(int num){

        if (num < 0){
            return 0;
        }
        if(num > 1){

            return num * factorial(num - 1);
        }
        return 1;
    }
}
