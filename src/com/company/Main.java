package com.company;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        //create a NewsPaper object
        NewsPaper newsPaper = new NewsPaper();

        String answer = "";

        // get the newspaper brand name
        System.out.print("Enter the newspaper brand name: ");
        newsPaper.setBrand(keyboard.nextLine());

        do{
            // ask the user if he wants to enter a new article
            System.out.print("Press (A) to enter a new article or (Q) to quit.");
            answer = keyboard.next();
            keyboard.nextLine();
            if(answer.equalsIgnoreCase("A")) {
                // Get the newspaper article's name and date
                System.out.print("Enter the article name: ");
                String name = keyboard.nextLine();
                System.out.print("Enter the article date: ");
                String date = keyboard.nextLine();

                //create a new Article object and add it to the newspaper
                Article article = new Article(name, date);
                newsPaper.addArticle(article);
            }
        }while (!answer.equalsIgnoreCase("Q"));

        // display the news paper brand and articles
        System.out.println(newsPaper);

    }
}
