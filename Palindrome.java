import java.util.Scanner;

/**
Escribe un programa que pida una cadena al usuario y que revise si esta es un palindromo o no y terminar.

Un palindromo significa que los caracteres de la cadena son los mismos al leer hacia adelante o hace atras.
Debes ignorar los espacios, los acentos, puntuaciones y mayusculas y minusculas.

Ejemplos de palindromos:
Amor a Roma
Bob
Somos o no somos
Acaso hubo buhos aca.
Ana, la tacana catalana
racecar
was it a car or a cat I saw
never odd or even
rats live on no evil star

El programa debe imprimir true si es un palindromo y false si no lo es.
*/
class Palindrome {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    String s = inp.nextLine();
   	//write your code below
        s = s.replace(" ", "");
        s = s.replace(",", "");
        s = s.replace(".", "");
        s = s.replace(";", "");

        for(int i = 0; i<s.length(); i++) {
            s = s.replace(s.substring(i,i+1), s.substring(i,i+1).toLowerCase());
        }
        
        s = s.replace("á", "a");
        s = s.replace("é", "e");
        s = s.replace("í", "i");
        s = s.replace("ó", "o");
        s = s.replace("ú", "u");
        s = s.replace("ñ", "n");

        
        String aux1 = ""; 
        String aux2 = "";
        
        int medianaString = s.length() / 2;
        for(int i = 0; i < medianaString; i++){
            aux1 = aux1 + s.substring(i, i+1);
        }


         for(int i = s.length()-1; i > medianaString; i--){
            aux2 = aux2 + s.substring(i, i+1);
        }
      
        System.out.println(isItPalindrome(aux1, aux2));
  }
  
  public static boolean isItPalindrome(String linea1, String linea2) {
      boolean Palindrome;
      if (linea1.equals(linea2)) {
          Palindrome = true;
      }else {
          Palindrome = false;
      }
      
      return Palindrome;
  }
}
