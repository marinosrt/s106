package n2exercici2.Java;

import n2exercici2.Class.GenericMethods;
import n2exercici2.Class.Persona;

public class Main {

    public static void main(String[] args) {
        Integer[] IntList = {23, 15, 63};
        Number[] NumList = {0.3561f, -50.35, 1};
        Persona[] PerList = {
                new Persona("Marina", "Royo", 31),
        new Persona("\nYoli", "Castello", 24),
        new Persona("\nTomás", "Papurro", 60)};

        GenericMethods.printArray(IntList, NumList, PerList);
        //GenericMethods.print2(IntList);

    }

}
