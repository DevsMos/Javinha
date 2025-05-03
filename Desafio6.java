import java.util.Scanner;

public class Exercicio6 {
  public static void main(String args[]) {
    
   Scanner teclado = new Scanner(System.in);
   
    System.out.print("Digite a Primeira Nota: ");
    Float primeiraNota =  teclado.nextFloat();
    
    System.out.print("Digite a Segunda Nota: ");
    Float segundaNota =  teclado.nextFloat();
    
    Float media = (primeiraNota + segundaNota) / 2;
    
    
    System.out.printf("\nA média calculada entre %.2f e %.2f gerou uma média de %.2f", primeiraNota, segundaNota, media);
    
  }
}
