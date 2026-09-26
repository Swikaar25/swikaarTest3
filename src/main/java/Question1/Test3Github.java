

package Question1;

import java.util.Scanner;


public class Test3Github {

  public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        // 1D arrays
        String[] branches = {
            "Pinetown",
            "Amazimtoti",
            "Westvile"
        };

        String[] RoomTypes = {
            "Loung Suites",
            "Bedroom Suites"
        };

        // 2D array for sales
        int[][] sales = new int[3][2];

        // 1D array for totals
        int[] totals = new int[3];

        // Get sales from user
        for (int i = 0; i < branches.length; i++) {

            for (int j = 0; j < RoomTypes.length; j++) {

                System.out.print("Enter " + RoomTypes[j]  + " sales for " + branches[i] + ": ");

                sales[i][j] = input.nextInt();
            }
        }

        // Display sales report
        System.out.println("--------------------------------------");
        System.out.println("FUNTURE STORE SALES REPORT");
        System.out.println("-------------------------------------");
        System.out.printf("%-14s%-15s%-15s%n", "", "Lounge Suites", "BedRoom Suites");

        for (int i = 0; i < branches.length; i++) {

            System.out.printf("%-15s %-10d %-10d%n",
                    branches[i],
                    sales[i][0],
                    sales[i][1]);
        }

        // Calculate totals
        for (int i = 0; i < branches.length; i++) {

            totals[i] = sales[i][0] + sales[i][1];
        }

        // Display totals
        System.out.println();
        System.out.println(" BRANCH  TOTAL  ");
        System.out.println("-------------------------------------");

        for (int i = 0; i < branches.length; i++) {

            System.out.println(branches[i] + ": " + totals[i]);
        }

        // Find branch with highest sales
        int highest = 0;

        for (int i = 1; i < totals.length; i++) {

            if (totals[i] > totals[highest]) {
                highest = i;
            }
        }

        System.out.println();
        System.out.println("BRANCH WITH HIGHIEST TOTAL: "
                + branches[highest]);

        input.close();
    }
}
