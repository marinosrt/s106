package n3exercici1.Class;

import n3exercici1.Interface.Phone;

public class Generic {

    public static <T extends Phone> void GenericInterface (Smartphone smartphone){
        smartphone.call(674298433);
        smartphone.TakePicture("olives.");
    }

    public static <U extends Smartphone> void GenericSmartphone (Smartphone smartphone){
        smartphone.TakePicture("paella valenciana.");
    }

}
