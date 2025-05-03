import java.util.Scanner;

public class Exercicio9 {
  public static void main(String args[]) {
    
   Scanner teclado = new Scanner(System.in);
   
    System.out.print("Digite o valor em Real (R$) que você possuí: ");
    double valorReal =  teclado.nextDouble();
    
    System.out.print("Digite o valor do dólar hoje: ");
    double valorDolar =  teclado.nextDouble();
    
    double valorConvertido = valorReal / valorDolar;
    
    System.out.printf("Você tem R$ %.2f, o que equivale a US$ %.2f", valorReal, valorConvertido);
  
      
  }
  
}

