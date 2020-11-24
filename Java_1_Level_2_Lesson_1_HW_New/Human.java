package Java_1_Level_2_Lesson_1_HW_New;

class Human extends Person implements IRunable, IJumpable, ISwimable {
    protected int runLimit;
    protected int swimLimit;
    protected int jumpLimit;

    Human (String name, int runLimit, int swimLimit, int jumpLimit) {
        super(name);
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.jumpLimit = jumpLimit;
    }
    public boolean run (int distance) {
        return runLimit >= distance;
    }
    public boolean swim (int swimdistance) {
        return swimLimit >= swimdistance;
    }
    public boolean jump (int height) {
        return jumpLimit >= height;
    }
}
