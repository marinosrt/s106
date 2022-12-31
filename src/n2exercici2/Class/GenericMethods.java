package n2exercici2.Class;

public class GenericMethods {

    public static <T, U, K> void printArray(T[] elements, U[] elements2, K[] elements3){
        System.out.println("First List of Arguments: ");
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i]);
            if (i < elements.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Second list of arguments");
        for (int i = 0; i < elements2.length; i++) {
            System.out.print(elements2[i]);
            if (i < elements2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Third list of arguments");
        for (int i = 0; i < elements3.length; i++) {
            System.out.print(elements3[i]);
            if (i < elements3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static <L> void print2(L[] elemento){
        System.out.println("\n");
        for (int i = 0; i < elemento.length; i++) {
            System.out.print(elemento[i]);
            if (i < elemento.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }



}