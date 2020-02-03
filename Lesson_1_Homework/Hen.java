public class Hen extends Animal implements Runable, Jumpable {
    private int run_limit;
    private int jump_limit;

    public Hen (String name, String color, int age, int run_limit, int jump_limit) {
        super (name, color, age);
        this.run_limit = run_limit;
        this.jump_limit = jump_limit;
    } //если объявлен конструктор в абстрактном Animal, или

    //public Hen(String name, String color, int age, int run_limit, int jump_limit){
    //    this.name = name;
    //    this.color = color;
    //    this.age = age;
    //    this.run_limit = run_limit;
    //    this.jump_limit = jump_limit;
    //} //если не объявлен конструктор в абстрактном Animal

    @Override
    public String voice(){
        return "Ko-ko-ko!";
    }

    @Override
    public boolean run (int distance){
        return run_limit >= distance;
    }

    @Override
    public boolean jump (int height){
        return jump_limit >= height;
    }
}
