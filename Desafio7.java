import java.util.Scanner;

public class Exercicio7 {
  public static void main(String args[]) {
    
   Scanner teclado = new Scanner(System.in);
   
    System.out.print("Digite o valor em metros: ");
    Float valorMetro =  teclado.nextFloat();
    
    Float valorCentimetro = valorMetro * 100;
    Float valorMilimetro = valorMetro * 1000;
    
    System.out.printf("\nO valor em metro imputado foi %.2f. Convertendo para centimetro, gerou %.2f centrimetros e convertendo para milimetros, gerou %.2f milimetros", valorMetro, valorCentimetro, valorMilimetro);
      
  }
  
}

