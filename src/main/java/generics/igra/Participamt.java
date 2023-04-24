package generics.igra;

public abstract class Participamt {
    private String name;
    private int age;

    public Participamt(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
