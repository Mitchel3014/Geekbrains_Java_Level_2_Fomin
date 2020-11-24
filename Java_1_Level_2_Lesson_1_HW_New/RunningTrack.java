package Java_1_Level_2_Lesson_1_HW_New;

class RunningTrack extends Obstacle {
    protected  int distance;

    RunningTrack (int distance) {
        this.distance = distance;
    }

    @Override
    public boolean doIt (Person person) {
        if (person instanceof IRunable) {
            return ((IRunable) person).run(distance);
        } else
            return false;
    }
}
