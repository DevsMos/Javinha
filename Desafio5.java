import java.util.Scanner;

public class Exercicio5 {
  public static void main(String args[]) {
    
   Scanner teclado = new Scanner(System.in);
   
    System.out.print("Digite o valor desejado: ");
    Integer valor =  teclado.nextInt();
    
    Integer dobro = valor * 2;
    Integer triplo = valor * 3;
    
    System.out.println("\nO valor digitado foi: " + valor);
    System.out.println("O seu dobro é: " + dobro);
    System.out.print("O seu triplo é: " + triplo);

  }
}


