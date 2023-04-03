import java.util.Scanner;
public class Exercicio23 {
    public static void main(String[] args) {
      int num ;
      Scanner lernum = new Scanner(System.in);
      System.out.print("Escreva um Número: ");
      num = lernum.nextInt();
      if ( num > 80 ) {
        System.out.print("Número maior que 80: " + num);
      }
    }
}