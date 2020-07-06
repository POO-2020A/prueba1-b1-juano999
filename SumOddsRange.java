import java.util.Scanner;

/**
Pedir 2 numeros al usuario:

int num1;
int num2;


Puedes asumir que num2 > num1

Escribe un programa que calcule e imprima la suma de los numeros impares que estan entre num1 y num2 incluyendo estos numeros.

Ejemplo de entrada/salida:
#1: 3
#2: 11
35

#1: 4
#2: 20
96

#1: -2
#2: 6
8
*/
class SumOddsRange {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("#1: ");
    int num1 = s.nextInt();
    System.out.print("#2: ");
    int num2 = s.nextInt();
    //start below
    System.out.println(suma(num1, num2));
    
  }
  
  public static int suma(int numInicio, int numFinal) {
      int suma = 0;
      for(int i = numInicio ; i <= numFinal ; i++) {
          if (i % 2 != 0) {
              suma = suma + i;
          }
      }
      return suma;
  }
}
