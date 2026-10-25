/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fitnesstracker;

/**
 *
 * @author jemim
 */

import java.util.Scanner;

public class FitnessTracker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        do {
        
            System.out.print("Enter user name: ");
            String username = input.nextLine();

            System.out.print("Enter number of workout days to record: ");
            int workoutDays = input.nextInt();

            int totalSteps = 0;
            int goalDays = 0;

            
            for (int day = 1; day <= workoutDays; day++) {

                System.out.print("Enter steps for workout day " 
                                 + day + ": ");
                int steps = input.nextInt();

                totalSteps += steps;

                
                if (steps >= 10000) {
                    goalDays++;
                    System.out.println(
                        "Great job reaching your goal!"
                    );
                }

                
                if (steps < 2000) {
                    continue;
                }

                
                if (steps >= 2000 && steps < 10000) {
                    System.out.println(
                        "Keep going! You can do it!"
                    );
                }
            }

            
            double averageSteps = 0.0;

            if (workoutDays > 0) {
                averageSteps = (double) totalSteps / workoutDays;
            }

           
            System.out.println();
            System.out.println("======= FITNESS SUMMARY =======");
            System.out.println("User name: " + username);
            System.out.println("Total workout days: " + workoutDays);
            System.out.println("Total steps completed: " + totalSteps);
            System.out.printf(
                "Average steps per day: %.2f%n", averageSteps
            );
            System.out.println(
                "Number of goal-achieving days: " + goalDays
            );
            System.out.println("===============================");

            
            System.out.println();
            System.out.println("Enter 1 to enter another user.");
            System.out.println("Enter 0 to end the program.");
            System.out.print("Your choice: ");

            choice = input.nextInt();

      
            input.nextLine();

        } while (choice == 1);

        System.out.println("Fitness Tracker closed.");

        input.close();
    }
}
