/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Question2;

import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get information from user
        System.out.print("Enter the job type: ");
        String JobType = input.nextLine();

        System.out.print("Enter the pumbler name: ");
        String PlumberName = input.nextLine();

        System.out.print("Enter the number of jobs completed: ");
        int JobsCompleted = input.nextInt();

        // Create object
        PlumbingJobReport report =
                new PlumbingJobReport(
                        JobType,
                        PlumberName,
                        JobsCompleted);

        // Display report
        report.printPlumbingJobReport();

        input.close();
    }
}