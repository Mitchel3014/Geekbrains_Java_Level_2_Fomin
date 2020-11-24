package Java_1_Level_2_Lesson_1_HW_New;

abstract class Obstacle {
    public abstract boolean doIt (Person person);

    @Override
    public String toString () {
        return getClass().getSimpleName();
    }
}
