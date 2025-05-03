import java.util.Scanner;

public class Exercicio12 {
  public static void main(String args[]) {
    
   Scanner teclado = new Scanner(System.in);
   
   //Solicitando o nome do Colaborador
    System.out.print("Digite o nome do colaborador: ");
    String nomeColaborador =  teclado.nextLine();
    
   //Solicitando o salário do colaborador
    System.out.print("Digite o salário do colaborador: ");
    double salarioColaborador =  teclado.nextDouble();
   
   //Calculando o valor de reajuste (15% de dissídio)
   double dissidio = salarioColaborador * 0.15;
   
   //Calculando o valor do novo salário
   double salarioNovo = salarioColaborador + dissidio;
   
   //Exibindo os resultados
   System.out.println("\nColaborador: " + nomeColaborador);
   System.out.println("Salário Atual: " + salarioColaborador);
   System.out.println("Dissídio de 15%: " + dissidio);
   System.out.println("Novo salário: " + salarioNovo);
   
   
  }
  
}
    
}


