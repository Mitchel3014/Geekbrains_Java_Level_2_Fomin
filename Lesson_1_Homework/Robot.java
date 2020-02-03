public class Robot extends Person implements Runable, Swimable, Jumpable{
    private int run_limit;
    private int swim_limit;
    private int jump_limit;

    public Robot (String name, String sex, int age, int run_limit, int swim_limit, int jump_limit) {
        super (name, sex, age);
        this.run_limit = run_limit;
        this.swim_limit = swim_limit;
        this.jump_limit = jump_limit;
    } //если объявлен конструктор в абстрактном Animal, или

    //public Robot(String name, String sex, int age, int run_limit, int swim_limit, int jump_limit){
    //    this.name = name;
    //    this.sex = sex;
    //    this.age = age;
    //    this.run_limit = run_limit;
    //    this.swim_limit = swim_limit;
    //    this.jump_limit = jump_limit;
    //} //если не объявлен конструктор в абстрактном Animal

    @Override
    public String speak(){
        return "Hello my dear friend!";
    }

    @Override
    public boolean run (int distance){
        return run_limit >= distance;
    }

    @Override
    public boolean swim (int swim_distance){
        return swim_limit >= swim_distance;
    }

    @Override
    public boolean jump (int height){
        return jump_limit >= height;
    }
}
