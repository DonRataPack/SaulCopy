package ejercicios_aleatorios.numero_a_caracter;

public class NumberToCharacter {
    public static void main(String[] args) {
        numero_caracter(64);
    }
    private static void numero_caracter (int number){
        Character caracter = (char) number;
        System.out.println("Tu numero " + number + " es = " + caracter);
    }
}