CURSO DE PROGRAMAÇÃO JAVA ORACLE FUNDAMENTALS 2501
--------------------------------------------------------------------------------------------------------------------------------------------------


--------------------------------------------------------------------------------------------------------------------------------------------------
CÓDIGOS:
--------------------------------------------------------------------------------------------------------------------------------------------------


Operadores Aritméticos:

Exercício 04
------------------------------------------------------------------------------------------

import java.util.Scanner;	

public class Exercicio4 {
  public static void main(String args[]) {
    
   Scanner teclado = new Scanner(System.in);
   
    System.out.print("Digite o valor desejado: ");
    Integer valor =  teclado.nextInt();
    
    Integer antecessor = valor - 1;
    Integer sucessor = valor + 1;
    
    System.out.println("\nO valor digitado foi: " + valor);
    System.out.println("O seu antecessor é: " + antecessor);
    System.out.print("O seu sucessor é: " + sucessor);

  }
} 



Exercício 05
------------------------------------------------------------------------------------------

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


Exercício 06
------------------------------------------------------------------------------------------

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



Exercício 07
------------------------------------------------------------------------------------------

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

Exercício 08
------------------------------------------------------------------------------------------
import java.util.Scanner;

public class Desafio8 {
  public static void main(String args[]) {
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.print("Informe um número inteiro: ");
    Integer num = teclado.nextInt();
    
    System.out.format("\nTabuada do %d :\n", num);
    
    System.out.println("\n" + num + " x 0 =  " + (num*0));
    System.out.println(num + " x 1 =  " + (num*1));
    System.out.println(num + " x 2 =  " + (num*2));
    System.out.println(num + " x 3 =  " + (num*3));
    System.out.println(num + " x 4 =  " + (num*4));
    System.out.println(num + " x 5 =  " + (num*5));
    System.out.println(num + " x 6 =  " + (num*6));
    System.out.println(num + " x 7 =  " + (num*7));
    System.out.println(num + " x 8 =  " + (num*8));
    System.out.println(num + " x 9 =  " + (num*9));
    System.out.println(num + " x 10 = " + (num*10));
    
    teclado.close();
  }
}

  
Exercício 09
------------------------------------------------------------------------------------------

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

Exercício 10
------------------------------------------------------------------------------------------


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


Exercício 11
------------------------------------------------------------------------------------------

import java.util.Scanner;

public class Exercicio10 {
  public static void main(String args[]) {
    
   Scanner teclado = new Scanner(System.in);
   
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


Exercício 12
------------------------------------------------------------------------------------------

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