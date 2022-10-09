/*
Mosammad Kabir
Professor Debello
CUS 1115
April 11, 2021
 */

public class MaxOf3Ints {
    public static void main(String[] args) {
//Using nested if statement to display to the console the maximum of the 3 integers
        int x=1; int y=5;int z=3;

        int max;
        if(x>y)
        {
            if(x>z)max=x;
            else
                max=z;
        }
        else
        {
            if(y>z)max=y;
            else
                max=z;
        }
        System.out.println("The maximum value of all 3 integers entered: " +x+" "+y+" "+z+" is "+max);
        //create the nested if that will find the minimum of the 3 integers
        //output the minimum value of the 3 integers entered

        //Using nested if statement display to the console the minimum of the 3 integers
        int min;

        if(x<y)
        {
            if(x<z)min=x;
            else
                min=z;
        }
        else
        {
            if(y<z)min=y;
            else
                min=z;
        }

        System.out.println("The minimum value of all 3 integers entered: " +x+" "+y+" "+z+" is "+min);

    }}
    /*
    The maximum value of all 3 integers entered: 1 5 3 is 5
The minimum value of all 3 integers entered: 1 5 3 is 1
     */