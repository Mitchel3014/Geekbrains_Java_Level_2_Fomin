package Java_1_Level_2_Lesson_1_HW_New;

/**
 * Java. Level 2. Lesson 1. Homework 1 New version
 * @author Artem Fomin
 * @version dated 24.11.2020
 */

public class Java_1_Level_2_Lesson_1_HW_New {
    public static void main (String [] args) {

        Human human1 = new Human ("Алексей", 70, 50, 50);
        Human human2 = new Human ("Сергей", 100, 150, 20);
        Human human3 = new Human ("Вктор", 50, 100, 40);

        RunningTrack track1 = new RunningTrack (85);
        Pool pool1 = new Pool (100);
        Wall wall1 = new Wall (35);

        Person [] team = {human1, human2, human3};
        Obstacle [] obstacles = {track1, pool1, wall1};

        for (int i = 0; i< team.length; i++) {
            System.out.println("Член команды: " + team[i]);
            for (int z =0; z < obstacles.length; z++) {
                System.out.println("Результат преодоления препятствия " +obstacles[z]+ ": " +obstacles[z].doIt(team[i]));
            }
        }
    }
}