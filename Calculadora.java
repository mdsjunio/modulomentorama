import java.util.Scanner;

import javax.swing.Scrollable;

public class Calculadora{
    public static void main(String[] args) {
        System.out.println("Calcuadora Simples");
        int opcao;

        do{
            System.out.println("1-somar");
            System.out.println("2-subtrair");
            System.out.println("3-multiplicar");
            System.out.println("4-dividir");
            System.out.println("0-Sair");

           Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();
            processar(opcao);

            }while( opcao != 0);
        }

       public static void processar(int opcao) {
           switch(opcao){
               case 1: {
                Scanner scanner = new Scanner(System.in);
                System.out.println("somar");
                System.out.println("digitar primeiro valor");
                int numero1 = scanner.nextInt();
                System.out.println("digitar segundo  valor");
                int numero2 = scanner.nextInt();
                int resut = numero1 + numero2;
                System.out.println("o resultado é: "+resut);
                break;

               }
               case 2:{
                Scanner scanner = new Scanner(System.in);
                System.out.println("subtrair");
                System.out.println("digitar primeiro valor");
                int numero1 = scanner.nextInt();
                System.out.println("digitar segundo  valor");
                int numero2 = scanner.nextInt();
                int resut = numero1 - numero2;
                System.out.println("o resultado é: "+resut);
                break;
               }
               case 3:{
                Scanner scanner = new Scanner(System.in);
                System.out.println("multiplicar");
                System.out.println("digitar primeiro valor");
                int numero1 = scanner.nextInt();
                System.out.println("digitar segundo  valor");
                int numero2 = scanner.nextInt();
                int resut = numero1 * numero2;
                System.out.println("o resultado é: "+resut);
                break;
               }
               case 4:{
                Scanner scanner = new Scanner(System.in);
                System.out.println("dividir");
                System.out.println("digitar primeiro valor");
                double numero1 = scanner.nextInt();
                System.out.println("digitar segundo  valor");
                double numero2 = scanner.nextInt();
                if (numero2 == 0){
                    System.out.println("impossivel dividir por zero");
                }else{
                double resut = numero1 / numero2;
                double resut2 = numero1 % numero2;
                System.out.println("o resultado é: "+resut);
                System.out.println("o resto é: "+resut2);
                break;
                }
                
               }

           }
           

       }

    }
