package n1exercici2.Class;

public class Persona {

    private String name;
    private String surname;
    private int age;

    public Persona(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return getName() + " " +
                getSurname() + " " +
                "age " + getAge();
    }
}
