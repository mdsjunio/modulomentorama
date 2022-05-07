import java.util.Scanner;

    public class Aula2 {
        public static void main(String [] args){
            System.out.println("------CADASTRO DE USUARIO----------");
            Scanner scanner = new Scanner(System.in);
            //Solicitar o nome completo do usuario
            System.out.println("Digite seu nome Completo: ");
            String nome = scanner.nextLine();
            //Solicitar a rua
            System.out.println("Informe a rua: ");
            String rua = scanner.nextLine();
            //Solicitar numero
            System.out.println("Informe o n° da rua: ");
            String numerorua = scanner.nextLine();
            //Solicitar Bairro
            System.out.println("Informe seu Bairro; ");
            String bairro = scanner.nextLine();
            //Solicitar Cidade
            System.out.println("Informe sua Cidade; ");
            String cidade = scanner.nextLine();
            //Solicitar Estado
            System.out.println("Informe seu Estado; ");
            String estado = scanner.nextLine();
            //Solicitar CEP
            System.out.println("Informe seu CEP; ");
            String cep = scanner.nextLine();
            //Exibir as informações formatadas
            System.out.println("Nome Completo: "+ nome);
            System.out.println("Endereço: " + rua + ", " + numerorua+ " - " + bairro +", "+cidade+" - "+estado);
            System.out.println("CEP: "+ cep);

            





    }
    
}
