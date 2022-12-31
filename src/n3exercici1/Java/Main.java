package n3exercici1.Java;

import n3exercici1.Class.Generic;
import n3exercici1.Class.Smartphone;

public class Main {

    public static void main(String[] args) {
        Smartphone smartphone;

        Generic.GenericInterface(new Smartphone("Marina", 623998766));
        Generic.GenericSmartphone(new Smartphone<>("Manel", 786554412));

    }

}
