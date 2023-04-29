import java.util.Scanner;

public class calculateAverage{
  /**
   * 1. Faça um programa que leia 3 valores, calcule e escreva a média aritmética
   * desses valores. A média deve ser calculada por um método
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double n1, n2, n3, average=0.0;

    System.out.println("Informe três valores: ");
    n1 = in.nextDouble();
    n2 = in.nextDouble();
    n3 = in.nextDouble();

    average = calculateAverage(n1,n2,n3);
    System.out.printf("A média é %.2f " , average);

    System.out.printf("\n.::Fim da Execução::.");
    in.close();
  }

  public static double calculateAverage(double valor1, double valor2, double valor3){
    double average = (valor1 + valor2 + valor3) / 3;
    return average;
  }
}