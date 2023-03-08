/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Student Name: Thompson Caleb
 * Description: Lab 04 - TaskScheduler
 */

import javax.swing.*;
import java.awt.*;


public class TaskScheduler extends JFrame {

    private CircularLinkedList<Task> tasks;
    public static final int WIDTH  = 640;
    public static final int HEIGHT = 480;
    static final String TITLE = "CS 2050 - Lab 04";

    TaskScheduler(CircularLinkedList<Task> tasks) {
        this.tasks = tasks;
        setSize(WIDTH, HEIGHT);
        setTitle(TITLE);

        // content pane
        Container contentPane = getContentPane();
        contentPane.add(new TaskSchedulerPanel(tasks));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.WHITE);
        setVisible(true);
    }

    public void run() {
        /**
         * TODO #7: iterate over the tasks; if the task is dead, ignore it and move to the next one in the list; if the task is alive, run the task a number of times based on its priority (1x for low, 2x for standard, and 3x for high); for a better visual effect, have the code sleep for 250ms and then call repaint every time a task runs
         */
        for(Task tasks : tasks) {
            if(tasks.isDead())
                continue;
            else {
                for(int i = 0; i < tasks.getPriority(); i++) {
                    tasks.run();
                    try {
                        Thread.sleep(250);
                    }
                    catch (Exception ex) {

                    }
                    repaint();
                }
            }
        }
    }

    public static void main(String[] args) {
        int numberTasks = 0;
        while (numberTasks <= 0) {
            String input = JOptionPane.showInputDialog(null, "How many tasks?", "Task Scheduler", JOptionPane.QUESTION_MESSAGE);
            try {
                numberTasks = Integer.parseInt(input);
            }
            catch (Exception ex) {

            }
        }
        CircularLinkedList<Task> tasks = new CircularLinkedList<>();
        for (int i = 1; i <= numberTasks; i++) {
            String input = JOptionPane.showInputDialog(null, "Enter the size and priority of task #" + i + " as numbers separated by comma:", "Task Scheduler", JOptionPane.QUESTION_MESSAGE);
            String fields[] = input.split(",");
            int size = Integer.parseInt(fields[0]);
            int priority = Integer.parseInt(fields[1]);
            Task task = new Task(size, priority);
            tasks.append(task);
        }
        (new TaskScheduler(tasks)).run();
    }
}
