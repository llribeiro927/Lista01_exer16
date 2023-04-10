import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        // Faça um programa para uma loja de tintas
        // O programa deverá pedir o tamanho em metros quadrados da área a ser pintada
        // Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros
        // que custam R$ 80,00. 
        //Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
        double area; 
        double latas;
        double precoFinal; 
        
        System.out.println("Informe o tamanho em metros quadrados da aréa a ser pintada: ");
        Scanner teclado = new Scanner(System.in); 
        area  = teclado.nextFloat(); 

        latas = Math.ceil(area / 54.0);
        precoFinal = latas * 80; 

        System.out.println("Para cada metro quadrado você irá precisar de: " + latas + " latas " );
        System.out.println("O preço final é de: " + precoFinal + " R$ " );
        teclado.close();




    }
}
