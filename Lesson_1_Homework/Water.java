public class Water extends Obstacle{
    private int swim_distance;

    public Water (int swim_distance){
        this.swim_distance = swim_distance;
    }

    @Override
    public boolean doIt(Animal animal){
        if (animal instanceof Swimable)
            return ((Swimable) animal).swim(swim_distance);
        else
            return false;
    }

    //public boolean doIt (Animal animal) {
    //    if (animal instanceof Swimable)
    //        return ((Swimable) animal).swim(swim_distance);
    //    else
    //        return false;
    //}
}