public class Track extends Obstacle{
    private int distance;

    public Track (int distance){
        this.distance = distance;
    }

    @Override
    public boolean doIt(Animal animal){
        if (animal instanceof Runable)
                return ((Runable) animal).run(distance);
            else
                return false;
    }

    //public boolean doIt (Animal animal) {
    //    if (animal instanceof Runable)
    //        return ((Runable) animal).run(distance);
    //    else
    //        return false;
    //}
}