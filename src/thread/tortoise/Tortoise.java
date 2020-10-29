/*   Created by IntelliJ IDEA.
 *   Author: Kritika Sharma
 *   Date: 29-10-2020
 *   Time: 11:15
 *   File: Tortoise.java
 */
package thread.tortoise;

import javax.swing.*;

public class Tortoise extends Thread {
    private static final int MILESTONES = 5;

    public Tortoise() {
        super("Tortoise");
    }

    @Override
    public void run() {
        System.out.println("The thread Tortoise has started.");
        for (int index = 0; index < MILESTONES; index++) {
            switch (index) {
                case 0:
                    System.out.println("The Tortoise has started from the start line!");
                    break;
                case 1:
                    System.out.println("The Tortoise has reached the Cool River!");
                    break;
                case 2:
                    System.out.println("The Tortoise has reached the Mountain Hill!");
                    break;
                case 3:
                    System.out.println("The Tortoise has reached the Big Oak Tree!");
                    break;
                case 4:
                    System.out.println("The Tortoise has reached the finish line!");
                    break;
            }
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                System.err.println("The Tortoise has won the path!");
            }
        }
        JOptionPane.showConfirmDialog(
                null,
                "The Tortoise has completed the race! and has won",
                "Tortoise",
                JOptionPane.OK_CANCEL_OPTION
        );
    }
}


