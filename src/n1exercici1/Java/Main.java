package n1exercici1.Java;

import n1exercici1.Class.NoGenericMethods;
import n1exercici1.Class.NoGenericMethods2;

public class Main {

    public static void main(String[] args) {
        //variables
        int num1 = 34;
        int num2 = 4;
        int num3 = 3;
        Number Num1[] = {1, 2, 3, 0.25, 5};
        Number Num2[] = {-103.342, 4.6, 35.3, 2.2, 1};
        Number Num3[] = {Num1[3], Num2[3], Num1[0], Num2[0]};

        NoGenericMethods MyNoGeneric;
        NoGenericMethods2 MyOtherNoGeneric;

        System.out.println("Integer Objects.");

        //constructor of the NoGenericMethod obj
        MyNoGeneric = new NoGenericMethods(num1, num2, num3);
        System.out.println(MyNoGeneric);

        //passing parameters in a different way
        MyNoGeneric = new NoGenericMethods(num2, num3, num1);
        System.out.println(MyNoGeneric);

        MyNoGeneric = new NoGenericMethods(num3, num1, num2);
        System.out.println(MyNoGeneric);


        //NUMBER Array Objects, with integer, floats and doubles

        System.out.println("\n\nNumber Objects with parametrized Integers, Doubles and Floats:.\n");

        MyOtherNoGeneric = new NoGenericMethods2(Num1, Num2, Num3);
        System.out.println("" + MyOtherNoGeneric);

        MyOtherNoGeneric = new NoGenericMethods2(Num2, Num3, Num1);
        System.out.println(MyOtherNoGeneric);

        MyOtherNoGeneric = new NoGenericMethods2(Num3, Num1, Num2);
        System.out.println(MyOtherNoGeneric);


    }
}