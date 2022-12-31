package n2exercici1.Java;

import n2exercici1.Class.GenericMethods;
import n2exercici1.Class.Persona;

public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona("Marina", "Royo", 31);

        GenericMethods.print(persona, " creating a non-generic parameter ", 32);
        GenericMethods.print("\nLet's introduce another non-generic parameter", ": 34 / 5 : ", 34/5);

    }

}
