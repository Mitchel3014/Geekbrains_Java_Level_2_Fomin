package Java_1_Level_2_Lesson_1_HW_New;

abstract class Person {
    String name;

    Person (String name) {
        this.name = name;
    }

    @Override
    public String toString () {
        return name;
    }
}
