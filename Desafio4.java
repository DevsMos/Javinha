import java.util.Scanner;

public class Desafio22 {

    public static void main(String[] args) {
        
        Scanner  scn1 =new Scanner(System.in);
        Double real,dolar,convertido;
        
        System.out.println("digite o valor em real hoje");
        real = scn1.nextDouble();

        System.out.println("digite o valor do dolar hoje ");
        dolar = scn1.nextDouble();

        convertido=real/dolar;
        System.out.println("o valor convertido em reais é "+ convertido);


    }
    
}
