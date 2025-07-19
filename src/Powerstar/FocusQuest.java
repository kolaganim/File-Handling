package Powerstar;
import java.util.*;
public class FocusQuest {
    static Scanner scanner = new Scanner(System.in);
    static List<Task> tasks = new ArrayList<>();
    static int points = 0;
    static int completedPomodoros = 0;
    public static void main(String[] args) {
        int choice;
        do {
            printMenu();
            while (!scanner.hasNextInt()) {
                System.out.print("Please enter a valid number: ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer
            switch (choice) {
                case 1 -> startPomodoro();
                case 2 -> addTask();
                case 3 -> viewTasks();
                case 4 -> markTaskCompleted();
                case 5 -> viewStats();
                case 6 -> System.out.println("Thanks for using FocusQuest.❤❤❤😊 Stay productive!");
                default -> System.out.println("Invalid option. Try again.");
            }
        } while (choice != 6);
    }

    static void printMenu() {
        System.out.println("\n👁👁 FocusQuest Menu 👁👁");
        System.out.println("1. Start Pomodoro");
        System.out.println("2. Add Task");
        System.out.println("3. View Tasks");
        System.out.println("4. Mark Task as Completed");
        System.out.println("5. View Stats");
        System.out.println("6. Exit");
        System.out.print("Choose an option: ");
    }

    static void startPomodoro() {
        System.out.println("\n🕒 Pomodoro Session Started!");
        System.out.println("Pretend you're focusing for 25 minutes...");
        System.out.println("Press ENTER when you're done focusing.");
        scanner.nextLine(); // wait for user to press Enter

        completedPomodoros++;
        points += 10;
        System.out.println("✅ Pomodoro session completed! You earned 10 points.");
        System.out.println("Take a 5-minute break... Press ENTER to continue.");
        scanner.nextLine(); // simulate break
    }

    static void addTask() {
        System.out.print("Enter task name: ");
        String taskName = scanner.nextLine();
        tasks.add(new Task(taskName));
        System.out.println("Task added.");
    }

    static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks added yet.");
            return;
        }
        System.out.println("\nYour Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            Task t = tasks.get(i);
            String status = t.isCompleted ? "Completed ✅" : "Pending ❗";
            System.out.println((i + 1) + ". " + t.name + " - " + status);
        }
    }

    static void markTaskCompleted() {
        viewTasks();
        if (tasks.isEmpty()) return;
        System.out.print("Enter task number to mark as completed: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a valid task number: ");
            scanner.next();
        }
        int taskNum = scanner.nextInt();
        scanner.nextLine(); // clear buffer
        if (taskNum > 0 && taskNum <= tasks.size()) {
            Task t = tasks.get(taskNum - 1);
            if (!t.isCompleted) {
                t.isCompleted = true;
                points += 5;
                System.out.println("🎯 Task marked as completed! +5 points.");
            } else {
                System.out.println("Task is already completed.");
            }
        } else {
            System.out.println("Invalid task number.");
        }
    }
    static void viewStats() {
        long completedTasks = tasks.stream().filter(t -> t.isCompleted).count();
        System.out.println("\n📊 Your Stats:");
        System.out.println("✅ Completed Pomodoros: " + completedPomodoros);
        System.out.println("⭐ Points: " + points);
        System.out.println("📌 Completed Tasks: " + completedTasks + "/" + tasks.size());
        System.out.println("🏅 Level: " + (points / 20 + 1));
    }
}
class Task {
    String name;
    boolean isCompleted;
    Task(String name) {
        this.name = name;
        this.isCompleted = false;
    }
}