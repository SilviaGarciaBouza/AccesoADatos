package teoria;

public class Excepciones {
    public static void main(String[] args) {
        caso1();
        caso2();
    }

    public static void caso1() {
        String[] array = new String[5];
        array[3].length();
    }

    public static void caso2() {
        String aux= "hola";
        int aux2 = Integer.parseInt(aux);

    }

}
