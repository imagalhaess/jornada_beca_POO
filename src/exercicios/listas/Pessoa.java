package exercicios.listas;

public class Pessoa {
    protected String name;
    protected int age;

    public Pessoa(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Nome: " + this.name + " | Idade: " + this.age;
    }
}
