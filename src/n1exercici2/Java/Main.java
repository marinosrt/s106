package n1exercici2.Java;

import n1exercici2.Class.GenericMethods;
import n1exercici2.Class.Persona;

public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona("Marina", "Royo", 31);

        GenericMethods.print(persona.toString(), " Caput ", 32);
        GenericMethods.print("\nAge: " + persona.getAge(), " Surname: " + persona.getSurname(), " Name: " + persona.getName());
        GenericMethods.print("\n" + -131.45, " " + 0.3452f, " Provant");
    }

}
