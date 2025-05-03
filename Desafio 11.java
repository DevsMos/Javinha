import java.util.Scanner;

public class Exercicio10 {
  public static void main(String args[]) {
    
  s
   
   //Solicitando o nome do produto
    System.out.print("Digite o nome do produto: ");
    String nomeProduto =  teclado.nextLine();
    
   //Solicitando o preço do produto
    System.out.print("Digite o preço do produto: ");
    double precoProduto =  teclado.nextDouble();
   
   //Calculando o valor de desconto (5% de desconto)
   double desconto = precoProduto * 0.05;
   
   //Calculando o valor final com desconto
   double precoFinal = precoProduto - desconto;
   
   //Exibindo os resultados
   System.out.println("Produto: " + nomeProduto);
   System.out.println("Preço original: " + precoProduto);
   System.out.println("Desconto de 5%: " + desconto);
   System.out.println("Preço Final com desconto: " + precoFinal);
   
   
  }
  
}


