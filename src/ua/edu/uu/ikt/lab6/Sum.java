package ua.edu.uu.ikt.lab6;

public class Sum {

    public static int sum(int number){
        if(number > 0){
            return number + sum(number - 1);
        }
        return 0;
    }
}
