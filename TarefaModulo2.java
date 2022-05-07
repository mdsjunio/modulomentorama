import java.util.Scanner;
import javax.swing.Scrollable;
public class TarefaModulo2{

    public static void main(String[] args) {
        System.out.println("MENU DE OPÇÕES:");
        int opcao;

        do{
                System.out.println("1- Opção 1");
                System.out.println("2- Opção 2");
                System.out.println("3- Sair");
                System.out.println("Digite a opção desejada:");
                Scanner scanner = new Scanner(System.in);
                opcao = scanner.nextInt();
                processar(opcao);
           
            }while( opcao != 3);
                System.out.println("O programa foi encerrado");
        }
        public static void processar(int opcao){
              switch(opcao){
                case 1:{
                     System.out.println("Você escolheu a primeira opção");
                    break;
                }
                case 2:{
                     System.out.println("Você escolheu a segunda opção");
                    break;
                }

            }
        }
}
            
               

            
                
            
    
    