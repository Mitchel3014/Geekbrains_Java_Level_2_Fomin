public class Wall extends Obstacle{
    private int height;

    public Wall (int height){
        this.height = height;
    }

    @Override
    public boolean doIt(Animal animal){
        if (animal instanceof Jumpable)
            return ((Jumpable) animal).jump(height);
        else
            return false;
    }

    //public boolean doIt (Animal animal) {
    //    if (animal instanceof Jumpable)
    //        return ((Jumpable) animal).jump(height);
    //    else
    //        return false;
    //}
}