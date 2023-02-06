//examen daniel Ramirez Aguilar ID:172020
import java.util.Scanner;

public class 	Examen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        String cadena;
        do {
            System.out.println("\nMenú de opciones de metodos:");
            System.out.println("1. Primera letra en mayúscula");
            System.out.println("2. Invertir cadena");
            System.out.println("3. Vocales en mayuscula");
            System.out.println("4. FizzBuzz");
            System.out.println("5. Palindromo");
            System.out.println("6. Salir");
            System.out.print("Seleccione una metodo: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Escribe una cadena de frase: ");
                    cadena = sc.nextLine();
                    System.out.println("Resultado: " + primeraMayuscula(cadena));
                    break;
                case 2:
                    System.out.print("Escribe una cadena de frase: ");
                    cadena = sc.nextLine();
                    System.out.println("Resultado: " + invertirCadena(cadena));
                    break;
                case 3:
                    System.out.print("Escribe una cadena de frase: ");
                    cadena = sc.nextLine();
                    System.out.println("Resultado: " + vocalesMayuscula(cadena));
                    break;   
                case 4:
                    fizzBuzz();
                    break;
                case 5:
                    System.out.print("Escribe la palabra a evaluar: ");
                    cadena = sc.nextLine();
                    System.out.println(palindromo(cadena));
                    break;
                case 6:
                    System.out.println("Muchas gracias por finalizar el examen");
                    break;
                default:
                    System.out.println("Opción inválida seleccione una opción valida.");
                    break;
            }
        } while (opcion != 6);
    }
//metodo 1: Dada una cadena haga un programa que convierta la primera letra en  mayúscula. (Hagan una prueba con la frase “anita lava la tina”).

    public static String primeraMayuscula(String cadena) {
        return Character.toUpperCase(cadena.charAt(0)) + cadena.substring(1);
    }
//METODO 2: Invertir una cadena: Invierta una cadena. Dada una cadena inicial escriba un programa para invertirla.
    public static String invertirCadena(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }
//METODO 3: Vocales en mayúscula: Haga un programa que tome una cadena y convierta todas laS vocales a mayúsculas.
    public static String vocalesMayuscula(String cadena) {
        String vocales = "aeiou";
        String resultado = "";
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (vocales.indexOf(Character.toLowerCase(caracter)) >= 0) {
                resultado += Character.toUpperCase(caracter);
            } else {
                resultado += caracter;
            }
        }
		return resultado;
        }
//METODO 4: FizzBuzz: Deberán imprimir los números del 1 al 100, sin embargo para los múltiplos de 3
   // deberán imprimir "Fizz" en lugar del número, para los múltiplos de 5 deberán imprimir
  //  "Buzz". Por último, para los múltiplos de 3 y 5 impriman "FizzBuzz“.
        public static void fizzBuzz() {
        	
          for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
              System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
              System.out.println("Fizz");
            } else if (i % 5 == 0) {
              System.out.println("Buzz");
            } else {
              System.out.println(i);
            }
          }
        }
//METODO 5: Palíndromo: Dada una cadena, escribe un programa para comprobar si es un palíndromo
   //     (una palabra, frase o secuencia que se lee de la misma forma al derecho y al revés) como
 //       Sugus, Girafarig, ó Anita lava la tina.
        public static boolean palindromo(String cadena) {
          String cadenaSinEspacios = cadena.replaceAll("\\s+", "").toLowerCase();
          int longitud = cadenaSinEspacios.length();
          for (int i = 0; i < longitud / 2; i++) {
            if (cadenaSinEspacios.charAt(i) != cadenaSinEspacios.charAt(longitud - i - 1)) {
              return false;
            }
          }

        return true;
    }
}
	 