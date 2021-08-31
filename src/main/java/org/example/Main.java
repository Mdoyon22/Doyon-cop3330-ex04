/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Doyon
 */
package org.example;
import java.util.Scanner;


public class Main
{
    public static void main( String[] args )
    {
        Scanner Inp = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = Inp.nextLine();
        System.out.print("Enter a verb: ");
        String verb = Inp.nextLine();
        System.out.print("Enter an adjective: ");
        String adjective = Inp.nextLine();
        System.out.print("Enter an adverb: ");
        String adverb = Inp.nextLine();

        System.out.print("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");
    }
}
