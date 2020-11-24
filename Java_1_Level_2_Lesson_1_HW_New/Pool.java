package Java_1_Level_2_Lesson_1_HW_New;

class Pool extends Obstacle {
    protected int swimdistance;

    Pool (int swimdistance) {
        this.swimdistance = swimdistance;
    }

    @Override
    public boolean doIt (Person person) {
        if (person instanceof ISwimable) {
            return ((ISwimable) person).swim(swimdistance);
        } else
            return false;
    }
}
