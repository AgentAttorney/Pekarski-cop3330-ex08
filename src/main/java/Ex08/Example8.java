package Ex08;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Richard Pekarski
 */

public class Example8 {
    public static void main(String[] args)
    {
        System.out.print("How many people? ");
        Scanner input = new Scanner(System.in);
        int num_people = input.nextInt();

        System.out.print("How many pizzas do you have? ");
        int num_pizzas = input.nextInt();

        System.out.print("How many slices per pizza? ");
        int num_slices = input.nextInt();
        int tot_slices = num_slices * num_pizzas;

        System.out.println(num_people + " people with " + num_pizzas +
                " pizzas (" + tot_slices + " slices)");

        int per_person = tot_slices / num_people;
        int left_slices = tot_slices - (per_person * num_people);

        System.out.printf("Each person gets " + per_person + " pieces of pizza.%nThere are "
                + left_slices + " leftover pieces.");

    }
}
