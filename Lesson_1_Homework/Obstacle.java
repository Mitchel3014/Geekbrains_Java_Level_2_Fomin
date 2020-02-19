public abstract class Obstacle {
    public abstract boolean doIt(Animal animal);

    @Override
    public String toString() {
        return "Препятствие: " + this.getClass().getName();
    }
}
