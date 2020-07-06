import java.util.Scanner;

/**
Obtener una cadena del usuario y almacenarla en:
String s;

Escribe un bucle for que imprima la cadena alternando las mayusulas y minusculas, siendo la primera letra siempre minuscula.

Ten en cuenta los siguientes metodos de la clase String:
str.toUpperCase(); // make it uppercase
str.toLowerCase(); // make it lowercase 

NO UTILICES EL METODO .chatAt ya que este retorna un char y lo que necesitas es un String para hacerlo mayuscula o minuscula. Para obtener una letra en una posicion,
puedes usar el siguiente metodo:
str.substring(x, x+1); // devuelve el caracter como string en la posicion x

Ejemplos de entrada/salida:
In: powerful
pOwErFuL

In: COMEDIC
cOmEdIc

In: acroBATics
aCrObAtIcS

PISTA: Necesitaras una sentencia if dentro del for! 
*/
class MixedCase {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    String s = inp.nextLine();
    //write your code below
  }
}
