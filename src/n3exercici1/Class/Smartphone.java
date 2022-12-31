package n3exercici1.Class;

import n3exercici1.Interface.Phone;

public class Smartphone <U> implements Phone {

    private String Phone;
    private int PhoneNumber;

    public Smartphone(String phone, int phoneNumber) {
        Phone = phone;
        PhoneNumber = phoneNumber;
    }

    public String getPhone() {
        return Phone;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    @Override
    public void call(int number){
        System.out.println(getPhone() + " phone, calling to " + number + " number");
    }

    public void TakePicture(String picture){
        System.out.println(getPhone() + " phone, taking a picture of " + picture);
    }

}
