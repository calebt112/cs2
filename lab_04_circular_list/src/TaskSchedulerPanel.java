/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Lab 04 - TaskSchedulerPanel
 */

import javax.swing.*;
import java.awt.*;

public class TaskSchedulerPanel extends JPanel {

    private CircularLinkedList<Task> tasks;
    private static final int BAR_WIDTH = 50;
    private static final int TASK_UNIT_HEIGHT = 5;
    private static final int BAR_MARGIN = 5;

    public TaskSchedulerPanel(CircularLinkedList<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(TaskScheduler.WIDTH, TaskScheduler.HEIGHT);
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        int size = tasks.size();
        int x = (getWidth() - size * BAR_WIDTH - (size - 1) * BAR_MARGIN) / 2;
        int count = 0;
        for (Task task: tasks) {
            if (task.getPriority() == Task.LOW_PRIORITY)
                g.setColor(Color.GRAY);
            else if (task.getPriority() == Task.HIGH_PRIORITY)
                g.setColor(Color.RED);
            else
                g.setColor(Color.GREEN);
            int height = task.getSize() * TASK_UNIT_HEIGHT;
            g.fillRect(x, TaskScheduler.HEIGHT - height, BAR_WIDTH, height);
            g.setColor(Color.BLACK);
            g.drawRect(x, TaskScheduler.HEIGHT - height, BAR_WIDTH, height);
            x += BAR_WIDTH + BAR_MARGIN;
            count++;
            if (count == size)
                break;
        }
    }
}
