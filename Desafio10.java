import java.util.Scanner;

public class Exercicio10 {
  public static void main(String args[]) {
    
   Scanner teclado = new Scanner(System.in);
   
   //Solicitando ao usuário a altura da parede
    System.out.print("Digite a altura da parede: ");
    Float altura =  teclado.nextFloat();
    
    //Solicitando ao usuário a largura da parede
    System.out.print("Digite a largura da parede: ");
    Float largura =  teclado.nextFloat();
    
    //Calculando a área
    Float area = largura * altura;
    
    //Calculando a quantidade de tinta necessária
    Float tintaNecessaria = area / 2;
    
    //Exibindo a quantidade de tinta necessária para realizar a pintura
    System.out.printf("A área da parede é de %.2f m².\n", area);
    System.out.printf("Você precisará de %.2f litro(s) de tinta para pintar a parede", tintaNecessaria);
  
      
  }
  
}



