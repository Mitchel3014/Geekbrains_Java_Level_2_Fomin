package Java_1_Level_2_Lesson_1_HW_New;

class Wall extends Obstacle {
    protected int height;

    Wall (int height) {
        this.height = height;
    }

    @Override
    public boolean doIt (Person person) {
        if (person instanceof IJumpable) {
            return ((IJumpable) person).jump(height);
        } else
            return false;
    }
}
